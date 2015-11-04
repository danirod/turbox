#!/bin/bash
#
# This script is executed by Travis-CI. It composes the javadoc and pushes it
# to the gh-pages branch used the provided key that has been encrypted before.
# https://github.com/ReadyTalk/swt-bling/blob/master/.utility/push-javadoc-to-gh-pages.sh

if [ "$TRAVIS_REPO_SLUG" == "danirod/turbox" ] && [ "$TRAVIS_JDK_VERSION" == "oraclejdk8" ] && [ "$TRAVIS_PULL_REQUEST" == "false" ] && [ "$TRAVIS_BRANCH" == "master" ]; then
  echo -e "Publishing Javadoc..."
  cp -R build/docs/javadoc $HOME/javadoc-latest

  cd $HOME
  git config --global user.email "travis@travis-ci.org"
  git config --global user.name "travis-ci"
  git clone --quiet --branch=gh-pages https://${GH_TOKEN}@github.com/danirod/turbox gh-pages > /dev/null

  cd gh-pages
  git rm -rf ./javadoc
  cp -Rf $HOME/javadoc-latest ./javadoc
  git add -f .
  git commit -m ":memo: Deploying Javadoc from Travis Build $TRAVIS_BUILD_NUMBER"
  git push -fq origin gh-pages > /dev/null

  echo -e "Javadoc deployed."
else
  echo -e "This build does not need Javadoc deployment."
fi
