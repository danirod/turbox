<p align="center"><img src="http://i.imgur.com/tVJtq81.png"></p>
<h2 align="center">Rewrite less, create more</h2>

# Contributing Guide

If you are reading this document, probably it's because you want to contribute
to TurboX development by creating an issue or sending a pull request. That is
super cool, but I ask you to read this document before continuing. This document
describes the rules and the procedures for contributing to this repository.
Adhere to this specification, and everybody will have fun here.

## Reporting issues

If you find a bug during the usage of TurboX, it's appreciated to send back a
issue tracker reporting that bug. It helps on the development and it's a good
way for contributing to the project to make it a better library.

However, before sending your issue tracker, you should follow this checklist.

* Are you using an old version of the library? If so, try upgrading to a recent
version and check whether the bug keeps happening on that version. If you have
enough technical knowledge, it would be cool if you could try using the latest
development snapshot of the library, to make sure the issue is already fixed and
staged for the next release.
* Is the bug already reported? Check out
[the list of issues](https://github.com/danirod/turbox/issues) and check if your
bug has already been reported by someone. However, don't back down on sending an
interesting bug because of the fear of being Duplicated. I prefer to close a bug
because of being Duplicated rathing than not having any bug report at all.

When sending a bug report, provide the following information:

* Operating system and computer specs.
* Expected behaviour and actual behaviour of your code.
* A snippet of code that provides an example of the buggy behaviour.

This is important. I need to be able to reproduce your bug. I'm unable to fix
bugs that I cannot see or trace.

Always file new reports in new issues. Don't worry, there are infinite issues
and you can create as many issues as you need. Please, do not report your bug
as a comment into an existing issue. I need every different issue to have an
unique issue ID to trace them.

## Contributing to the project

If you have the knowledge, you can contribute code to the project, for instance,
adding new features, fixing bugs, providing documentation or creating unit tests
for the project. By contributing code, you agree to the license of this project,
which is the Apache License 2.0. Review the contents of the LICENSE file before
contributing.

Before starting working on your idea, you should consider if your contribution
will fit into the objectives of this project. Not every pull request has to be
approved, so if you want to contribute on this project, make sure that your
contribution stays on focus with the project.

Also, if you plan on working on big features, I suggest you to communicate your
intentions before, so that I can be aware of it and maybe even provide help. You
wouldn't want to work for a long time on the project to have your idea rejected,
right?

### How to contribute

1. Fork the project and then clone your fork on your hard drive. I strongly
   suggest to add a second remote with the upstream repository:
   
   ```sh
   $ git clone git://github.com/<username>/turbox.git
   $ cd turbox
   $ git remote add upstream git://github.com/danirod/turbox.git
   ```
   
   If your fork already exists, I suggest you then to update your fork to the
   latest version:

   ```sh
   $ git checkout master
   $ git pull upstream master
   ```

2. Create a feature branch for working on your project.

   ```sh
   $ git checkout -b <branch-name>
   ```

3. Start contributing. Please, keep your commit history tidy. Use standard and
   well-formed commit messages and squash small commits that could be merged
   into a single commit object. Rebase interactively your repository before
   pushing your code if needed.

   Also, time to time merge or rebase the latest features from upstream into
   your feature branch to make sure that you don't rely on outdated code:

   ```sh
   git checkout <branch-name>
   git pull upstream master
   ```

4. Push the feature branch to your fork:

   ```sh
   git push origin <branch-name>
   ```

5. Start a Pull Request to merge **your feature branch** into **my master
branch**.

**I suggest you to create the Pull Request as soon as possible**. Don't worry,
you can keep pushing commits to your feature branch, GitHub will automatically
update your Pull Request with your newest commits. Why do I suggest this?
Because I can keep track of your progress and because it's a good way for making
code reviews, asking for help, tips... I won't merge your PR until you confirm
that your feature is ready and until you make sure that it passes all the tests.
