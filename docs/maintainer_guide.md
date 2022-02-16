# Branch maintainer's guide

This document describes what needs to be done when maintaining an unsupported branch.

## Prepare local workdir

```shell
git clone https://github.com/priv-kweihmann/meta-sca.git
cd meta-sca
git checkout <branch of your choice>
git branch <branch name of the update batch>
cd ..

export TEMPLATECONF=$(pwd)/meta-sca/conf/variant/scatest-qemux86-64
source poky/oe-init-build-env
```

## Cherry-pick the changes from master branch

Now you can cherry-pick the changes from `origin/master` that you would want in your update batch.
In case a commit doesn't apply you can decide on a case to case basis to either run
`git cherry-pick --skip` or patch the commit locally

## Testing

For testing purpose you will find the script `../meta-sca/test/buildntest`.
This script expects the SCA module names to be build and tested as input.
NOTE: The script needs to be run from a setup bitbake build console (`source poky/oe-init-build-env`)

It supports `all` as input to test **ALL** modules (be aware that this will take quite some time).
The script also supports language handles like `@python` to build and test all modules that use python.

### Choosing the modules

The easiest way is by looking at the output of `git log --oneline` of your update batch

```shell
50ad9ddc7 Update cppcheck-native to 2.7
42a46cf0f Update sudokiller to latest
7022cc94f Update npm-listr2-native to 4.0.3
c83673bbe Update python3-semgrep-native to 0.82.0
d2a0f32c6 Update python3-ftfy-native to 6.1.1
6fdee669f Update github.com-fullstorydev-grpcurl-native to 1.8.6
```

this could be mapped to

```shell
50ad9ddc7 Update cppcheck-native to 2.7 --> cppcheck
42a46cf0f Update sudokiller to latest --> sudokiller
7022cc94f Update npm-listr2-native to 4.0.3 --> @npm as we don't know what kind of module is using that
c83673bbe Update python3-semgrep-native to 0.82.0 --> semgrep
d2a0f32c6 Update python3-ftfy-native to 6.1.1 --> @python as we don't know what module is using that
6fdee669f Update github.com-fullstorydev-grpcurl-native to 1.8.6 --> @go for the same reason as the @npm or @python cases
```

the resulting command line in this case will be `../meta-sca/test/buildntest cppcheck sudokiller @npm semgrep @python`.
And don't worry any duplicates will be filtered out automatically

## Analysing the output

Once everything is build and test you would get output like

```shell
[OKAY] Found 218 result for pylint@python3-git
[OKAY] Found no results for pylint@busybox
```

in this case all expectations have been fulfilled so this batch is ready to be send to meta-sca.

### Error cases

Sometimes things fail, like shown in the following

```shell
[OKAY] Found 218 result for pylint@python3-git
[ERROR] Found no results for foo@busybox
<stdout of the module>
```

in this case analyze the output of the shown `<stdout>` of the tool to determine what has gone wrong.

Options you have from here are

- drop one of the cherry-picked commits
- fix the commit (maybe inject missing dependencies)

In case os errors the exit code of the script would be != 0, so you can also run it as part of a CI.

## Send upstream

Push your changes to your fork of `meta-sca` and create a pull request (please make sure to choose the correct target branch)
