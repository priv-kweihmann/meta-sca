# meta-sca <!-- omit in toc -->

![https://img.shields.io/badge/Supported%20languages-C%2CC%2B%2B%2CGo%2CPython%2CShell%%2Cperl-informational](https://img.shields.io/badge/Supported%20languages-C%2CC%2B%2B%2CGo%2CPython%2CShell%2Cperl-informational)

[![Nightly](https://github.com/priv-kweihmann/meta-sca/actions/workflows/nightly_master.yml/badge.svg)](https://github.com/priv-kweihmann/meta-sca/actions/workflows/nightly_master.yml)
[![Latest commit](https://github.com/priv-kweihmann/meta-sca/actions/workflows/push_master.yml/badge.svg)](https://github.com/priv-kweihmann/meta-sca/actions/workflows/push_master.yml)

For the list of current findings from pipelines see [meta-sca report](https://priv-kweihmann.github.io/)

## Important note <!-- omit in toc -->

As announced by [this discussion](https://github.com/priv-kweihmann/meta-sca/discussions/8723) at the end of April 2022 this layer will undergo a major change in support.

Support will be given only for `master` branch

### What can I do when I'm affected by the changes

A maintainers guide can be found [here](docs/maintainer_guide.md).
Feel free to raise pull requests against not officially supported branches.

Support for these branches, including quality control, has to be done fully by the community

## Table of content <!-- omit in toc -->

- [Purpose](#purpose)
- [Getting started](#getting-started)
- [Installation](#installation)
  - [Prerequisites](#prerequisites)
  - [Use of containers](#use-of-containers)
  - [Use in CI](#use-in-ci)
  - [Setup](#setup)
  - [Kas](#kas)
- [Web monitor](#web-monitor)
- [Support](#support)
  - [Releases](#releases)
  - [Compatibility](#compatibility)
- [Licensing](#licensing)
- [Zero impact](#zero-impact)
- [Available tools](#available-tools)
  - [Overview of tools](#overview-of-tools)
- [Further documentation](#further-documentation)
- [Contributing](#contributing)
  - [Get involved](#get-involved)
  - [Security Policy](#security-policy)

## Purpose

Purpose of this layer is to provide a proper set of static analysis tools for your YOCTO build.
All provided tools can be easily configured and integrated into any CI service (like e.g. Jenkins).

All results are stored to __SCA_EXPORT_DIR__ (which defaults to __${DEPLOY_DIR_IMAGE}/sca__). The results will be stored in the raw-format of the corresponding tool and in checkstyle-format.

## Getting started

For a quick start how to use this layer see [getting started guide](docs/getting_started.md)

You can also watch the following talk

[![Watch the video](https://img.youtube.com/vi/41XtNkwi6cc/default.jpg)](https://youtu.be/41XtNkwi6cc)

I gave for YS2023.11 to get started.

## Installation

To install clone the needed branch(es) to any path on your local system.

### Prerequisites

- You need the current standard [__poky__-layer](https://git.yoctoproject.org/cgit/cgit.cgi/poky/) installed onto your local build environment.

### Use of containers

It is recommended to use `privkweihmann/yocto-sca-minimal:2004` docker container for building, which has all necessary requirements already installed.

### Use in CI

When you're planing to use meta-sca in your CI/CD, it is advised to use the minified layer [meta-sca-minified](https://github.com/priv-kweihmann/meta-sca-minified) to save you from cloning this fairly large repository.

**NOTE** [meta-sca-minified](https://github.com/priv-kweihmann/meta-sca-minified) only offer releases of this layer for releases made after 03/2020

### Setup

In your __bblayers.conf__-file add the following line

``` shell
BBLAYERS += "<full path to sca-layer>/meta-sca"
```

or with poky layer already setup run in shell

```shell
bitbake-layers add-layer "<full path to sca-layer>/meta-sca"
```

### Kas

Alternatively you can use [kas](https://kas.readthedocs.io) to setup the workspace.
Use `conf/kas/scatest-qemux86-64.yaml` from this layer

## Web monitor

If you're not quite convinced what this layer can do for you, have a look at the [web monitor](https://priv-kweihmann.github.io/), where all findings from the layer CI pipelines are publically available.

## Support

Actively maintained branch is currently only `master`.
Unmaintained branches will only receive package updates on demand.
Support for unmaintained branches has to be done by the community.

Status of the branches is described at [SECURITY.md](SECURITY.md).

It's advised to use the tagged source versions in productive environment.

### Releases

See [SECURITY.md](SECURITY.md) for details

### Compatibility

If there is a technical issue that might break backward compatibility it will be mentioned in release note of the corresponding milestone release.

## Licensing

This layer does only provide open source tools.
The layer itself is licensed under BSD.

If individual files are licensed under different terms, terms and conditions
can be found in the individual file header

## Zero impact

This layer provides only **-native** tools, so actually none of the build binaries will be deployed to your target.
Everything happens on the build machine.

## Available tools

The layer can check on a recipe-level or on an image-level.

- On image-level the whole root-filesystem could be taken into account, which in most cases can't be granted on a recipe-level.
- On the other hand some static code analysis does not make any sense on an image-level - so this layer does have different tools for both level available.

### Overview of tools

| Module          | Description                                   | Homepage                                                              | Requires      | Requires inet | Run on image | Run on recipe | Available in SDK | C   | C++ | Python | Shell | Javascript | PHP | Go  | Images | LUA | Spelling | Metrics | Binaries | Packages | Other formats | Security scope | Functional scope | Style scope |
| --------------- | --------------------------------------------- | --------------------------------------------------------------------- | ------------- | ------------- | ------------ | ------------- | ---------------- | --- | --- | ------ | ----- | ---------- | --- | --- | ------ | --- | -------- | ------- | -------- | -------- | ------------- | -------------- | ---------------- | ----------- |
| bandit          | Scan python code for insecurities             | https://github.com/PyCQA/bandit                                       |               |               | x            | x             | x                |     |     | x      |       |            |     |     |        |     |          |         |          |          |               | x              |                  |             |
| bashate         | Shell script linter                           | http://docs.openstack.org/developer/bashate/                          |               |               | x            | x             | x                |     |     |        | x     |            |     |     |        |     |          |         |          |          |               |                | x                | x           |
| bitbake         | Bitbake issue handling                        |                                                                       |               |               | x            | x             |                  |     |     |        |       |            |     |     |        |     |          |         |          | x        |               |                | x                | x           |
| cbmc            | C Bounded Model Checker                       | https://github.com/diffblue/cbmc/                                     |               | x             |              | x             |                  | x   |     |        |       |            |     |     |        |     |          |         |          |          |               |                | x                |             |
| checkbashisms   | Shell script linter                           | https://manpages.debian.org/jessie/devscripts/checkbashisms.1.en.html |               |               | x            | x             | x                |     |     |        | x     |            |     |     |        |     |          |         |          |          |               |                | x                | x           |
| cmake           | Get cmake errors and warnings                 |                                                                       |               |               |              | x             |                  | x   | x   |        |       |            |     |     |        |     |          |         |          |          |               |                | x                |             |
| cppcheck        | C/C++ linter                                  | https://github.com/danmar/cppcheck                                    |               |               |              | x             | x                | x   | x   |        |       |            |     |     |        |     |          |         |          |          |               | x              | x                | x           |
| cpplint         | C/C++ linter                                  | https://github.com/cpplint/cpplint                                    |               |               |              | x             | x                | x   | x   |        |       |            |     |     |        |     |          |         |          |          |               | x              | x                | x           |
| cvecheck        | Check for unpatched CVEs                      | https://github.com/clearlinux/cve-check-tool                          | manual enable | x             |              | x             |                  |     |     |        |       |            |     |     |        |     |          |         |          | x        |               | x              |                  |             |
| darglint        | Python docstring linter                       | https://github.com/terrencepreilly/darglint                           |               |               |              | x             | x                |     |     | x      |       |            |     |     |        |     |          |         |          |          |               |                |                  | x           |
| dennis          | I18N linter                                   | https://github.com/willkg/dennis/                                     |               |               |              | x             | x                |     |     |        |       |            |     |     |        |     |          |         |          |          | x             |                | x                | x           |
| detectsecrets   | Detect hardcoded secrets in code              | https://github.com/Yelp/detect-secrets                                |               |               | x            | x             | x                |     |     |        |       |            |     |     |        |     |          |         |          | x        |               | x              | x                |             |
| flake8          | Python linter                                 | http://flake8.pycqa.org/en/latest/                                    |               |               | x            | x             | x                |     |     | x      |       |            |     |     |        |     |          |         |          |          |               |                | x                | x           |
| flawfinder      | C/C++ security linter                         | https://github.com/david-a-wheeler/flawfinder                         |               |               |              | x             | x                | x   | x   |        |       |            |     |     |        |     |          |         |          |          |               | x              |                  |             |
| flint           | C/C++ linter                                  | https://github.com/JossWhittle/FlintPlusPlus                          |               |               |              | x             | x                | x   | x   |        |       |            |     |     |        |     |          |         |          |          |               |                | x                |             |
| gcc             | GCC compiler issues and hardening             |                                                                       |               |               |              | x             |                  | x   | x   |        |       |            |     |     |        |     |          |         |          |          |               | x              | x                |             |
| golint          | GO linter                                     | https://github.com/golang/lint                                        |               |               |              | x             | x                |     |     |        |       |            |     | x   |        |     |          |         |          |          |               |                |                  | x           |
| jsonlint        | JSON file linter                              |                                                                       |               |               | x            | x             | x                |     |     |        |       |            |     |     |        |     |          |         |          |          | x             |                | x                |             |
| kconfighard     | Kernel config hardening checker               | https://github.com/a13xp0p0v/kconfig-hardened-check                   |               |               |              | x             | x                |     |     |        |       |            |     |     |        |     |          |         |          |          | x             | x              |                  |             |
| licensecheck    | Scan code for license information             | https://github.com/boyter/lc                                          |               |               |              | x             |                  |     |     |        |       |            |     |     |        |     |          |         |          |          | x             | x              |                  |             |
| looong          | Find functions with too long arglists         | https://github.com/anapaulagomes/looong                               |               |               |              | x             | x                |     |     | x      |       |            |     |     |        |     |          |         |          |          |               |                |                  | x           |
| msgcheck        | I18n linter                                   | https://github.com/codingjoe/msgcheck                                 |               |               |              | x             | x                |     |     |        |       |            |     |     |        |     |          |         |          |          | x             |                |                  | x           |
| multimetric     | Coding metrics                                | https://github.com/priv-kweihmann/multimetric                         | manual enable |               | x            | x             | x                | x   | x   | x      |       | x          | x   | x   |        | x   |          | x       |          |          |               |                |                  | x           |
| mypy            | Python linter                                 | https://github.com/python/mypy                                        |               |               | x            | x             | x                |     |     | x      |       |            |     |     |        |     |          |         |          |          |               |                | x                |             |
| oelint          | Bitbake recipe linter                         | https://github.com/priv-kweihmann/oelint-adv                          |               |               | x            | x             |                  |     |     |        |       |            |     |     |        |     |          |         |          |          | x             |                |                  | x           |
| perl            | Perl warnings check                           |                                                                       |               |               |              | x             | x                |     |     |        |       |            |     |     |        |     |          |         |          |          | x             |                | x                |             |
| perlcritic      | Perl linter                                   | https://metacpan.org/pod/perlcritic                                   |               |               |              | x             | x                |     |     |        |       |            |     |     |        |     |          |         |          |          | x             |                | x                |             |
| pkgqaenc        | Enhanced package QA                           |                                                                       |               |               |              | x             |                  |     |     |        |       |            |     |     |        |     |          |         |          | x        |               | x              |                  |             |
| pscan           | Find insecure printfs                         | http://deployingradius.com/pscan/                                     |               |               |              | x             | x                | x   |     |        |       |            |     |     |        |     |          |         |          |          |               |                | x                |             |
| pylint          | Python linter                                 | https://github.com/PyCQA/pylint                                       |               |               | x            | x             | x                |     |     | x      |       |            |     |     |        |     |          |         |          |          |               |                | x                | x           |
| pysymcheck      | Check binaries for forbidden function usage   | https://github.com/priv-kweihmann/pysymbolcheck                       |               |               |              | x             |                  |     |     |        |       |            |     |     |        |     |          |         | x        |          |               | x              |                  |             |
| rats            | Check on insecurities in several languages    | https://github.com/redNixon/rats                                      |               |               |              | x             | x                |     | x   | x      | x     |            | x   |     |        |     |          |         |          |          |               | x              |                  |             |
| reuse           | Scan code for license information             | https://github.com/fsfe/reuse-tool                                    |               |               |              | x             |                  |     |     |        |       |            |     |     |        |     |          |         |          |          | x             | x              |                  |             |
| revive          | GO linter                                     | https://github.com/mgechev/revive                                     |               |               |              | x             | x                |     |     |        |       |            |     | x   |        |     |          |         |          |          |               |                | x                | x           |
| ruff            | Extremely fast python linter                  | https://github.com/astral-sh/ruff                                     |               |               | x            | x             | x                |     |     | x      |       |            |     |     |        |     |          |         |          |          |               |                | x                |             |
| scancode        | Scan code for license information             | https://github.com/nexB/scancode-toolkit                              |               |               |              | x             |                  |     |     |        |       |            |     |     |        |     |          |         |          |          | x             | x              |                  |             |
| setuptoolslint  | Lint python-setup.py                          | https://github.com/johnnoone/setuptools-pylint                        |               |               |              | x             | x                |     |     | x      |       |            |     |     |        |     |          |         |          |          |               |                | x                |             |
| shellcheck      | Shell script linter                           | https://github.com/koalaman/shellcheck                                |               |               | x            | x             | x                |     |     |        | x     |            |     |     |        |     |          |         |          |          |               |                | x                | x           |
| slick           | Shell script linter                           | https://github.com/mcandre/slick                                      |               |               | x            | x             | x                |     |     |        | x     |            |     |     |        |     |          |         |          |          |               |                | x                |             |
| sparse          | C linter                                      | https://sparse.wiki.kernel.org/index.php/Main_Page                    |               |               |              | x             | x                | x   |     |        |       |            |     |     |        |     |          |         |          |          |               |                | x                |             |
| stank           | Shell script linter                           | https://github.com/mcandre/stank                                      |               |               | x            | x             | x                |     |     |        | x     |            |     |     |        |     |          |         |          |          |               |                | x                | x           |
| systemdlint     | Systemd unit linter                           | https://github.com/priv-kweihmann/systemdlint                         |               |               | x            | x             | x                |     |     |        |       |            |     |     |        |     |          |         |          |          | x             | x              | x                | x           |
| tlv             | Find duplicate code                           | https://github.com/priv-kweihmann/tlv                                 | manual enable |               | x            | x             | x                | x   | x   | x      |       | x          | x   | x   |        |     |          |         |          |          |               | x              |                  | x           |
| tscancode       | C and lua linter                              | https://github.com/Tencent/TscanCode                                  |               |               |              | x             | x                | x   |     |        |       |            |     |     |        |     |          |         |          |          |               |                | x                |             |
| vulture         | Find dead python code                         | https://github.com/jendrikseipp/vulture                               |               |               | x            | x             | x                |     |     | x      |       |            |     |     |        |     |          |         |          |          |               |                | x                |             |
| xmllint         | XML linter                                    | http://xmlsoft.org/xmllint.html                                       |               |               | x            | x             | x                |     |     |        |       |            |     |     |        |     |          |         |          |          | x             |                | x                |             |
| yamllint        | YAML linter                                   | https://github.com/adrienverge/yamllint                               |               |               | x            | x             | x                |     |     |        |       |            |     |     |        |     |          |         |          |          | x             |                |                  | x           |

each tool does have it's own benefits and flaws so don't be mad if you have 10k+ findings on the initial run.

## Further documentation

- [Global Configuration](docs/conf/global.md)
  - [Blacklisting sources](docs/conf/blocklist.md)
  - [Configuration wizard](docs/conf/wizard.md)
  - [Custom severity](docs/conf/sevtransform.md)
  - [Enable SCA locally/globally](docs/conf/inherit.md)
  - [Fatal findings](docs/conf/suppression.md)
  - [Filter findings](docs/conf/findingsfilter.md)
  - [Filter out files to check](docs/conf/filefilter.md)
  - [Output formats](docs/conf/output_formats.md)
  - [Suppress findings](docs/conf/suppression.md)
  - [Trace source files](docs/conf/tracefiles.md)
  - [SDK support](docs/sdk_support.md)
  - Tools
    - [bandit](docs/conf/module/bandit.md)
    - [bashate](docs/conf/module/bashate.md)
    - [bitbake](docs/conf/module/bitbake.md)
    - [cbmc](docs/conf/module/cbmc.md)
    - [checkbashism](docs/conf/module/checkbashism.md)
    - [cmake](docs/conf/module/cmake.md)
    - [cppcheck](docs/conf/module/cppcheck.md)
    - [cpplint](docs/conf/module/cpplint.md)
    - [cvecheck](docs/conf/module/cvecheck.md)
    - [darglint](docs/conf/module/darglint.md)
    - [dennis](docs/conf/module/dennis.md)
    - [detectsecrets](docs/conf/module/detectsecrets.md)
    - [flake8](docs/conf/module/flake8.md)
    - [flawfinder](docs/conf/module/flawfinder.md)
    - [flint++](docs/conf/module/flint++.md)
    - [gcc](docs/conf/module/gcc.md)
    - [golint](docs/conf/module/golint.md)
    - [it](docs/conf/module/it.md)
    - [jsonlint](docs/conf/module/jsonlint.md)
    - [kconfighard](docs/conf/module/kconfighard.md)
    - [licensecheck](docs/conf/module/licensecheck.md)
    - [looong](docs/conf/module/looong.md)
    - [msgcheck](docs/conf/module/msgcheck.md)
    - [multimetric](docs/conf/module/multimetric.md)
    - [mypy](docs/conf/module/mypy.md)
    - [oelint](docs/conf/module/oelint.md)
    - [perl](docs/conf/module/perl.md)
    - [perlcritic](docs/conf/module/perlcritic.md)
    - [pkgqaenc](docs/conf/module/pkgqaenc.md)
    - [pscan](docs/conf/module/pscan.md)
    - [pylint](docs/conf/module/pylint.md)
    - [pysymcheck](docs/conf/module/pysymcheck.md)
    - [rats](docs/conf/module/rats.md)
    - [reuse](docs/conf/module/reuse.md)
    - [revive](docs/conf/module/revive.md)
    - [ruff](docs/conf/module/ruff.md)
    - [scancode](docs/conf/module/scancode.md)
    - [setuptoolslint](docs/conf/module/setuptoolslint.md)
    - [shellcheck](docs/conf/module/shellcheck.md)
    - [slick](docs/conf/module/slick.md)
    - [sparse](docs/conf/module/sparse.md)
    - [stank](docs/conf/module/stank.md)
    - [systemdlint](docs/conf/module/systemdlint.md)
    - [tlv](docs/conf/module/tlv.md)
    - [tscancode](docs/conf/module/tscancode.md)
    - [vulture](docs/conf/module/vulture.md)
    - [xmllint](docs/conf/module/xmllint.md)
    - [yamllint](docs/conf/module/yamllint.md)
- Configuration Examples
  - [C/C++ code while developing](docs/conf/examples/c_inflight.md)
  - [Image monitoring](docs/conf/examples/img_complete.md)
  - [Image security/hardening monitor](docs/conf/examples/img_secure.md)
  - [Python code while developing](docs/conf/examples/python_inflight.md)
  - [Shell code while developing](docs/conf/examples/shell_inflight.md)
  - [Webapps while developing](docs/conf/examples/web_inflight.md)
  - [Recommended tools for software integration](docs/conf/examples/integrators_favorites.md)
- [Results](docs/conf/results.md)
- Build system integration
  - [Control via command-line](docs/build/control_build_by_cmdline.md)
  - [SCA bot](docs/build/scabot.md)
  - Jenkins integration
    - [Basic jenkins integration](docs/build/jenkins/integration_basic.md)
    - [Parameterized jenkins build](docs/build/jenkins/integration_parameter.md)
- Application notes
  - [Recipe buildtime dependencies](docs/sca/buildtime_dependencies.md)
  - [How are the statistics of a tool calculated?](docs/sca/build_exec_times.md)
  - [How to build your own module](docs/add_your_own.md)
  - [build and version conflicts](docs/sca/version_preference.md)
  - [maintaining your own branch](docs/maintainer_guide.md)
- Case studies
  - [Regression on severe code issues](docs/casestudy/simple_regression.md)
  - [Idenfying hardening and security potential](docs/casestudy/adv_security.md)

## Contributing

Please see the detailed [contribution guideline](CONTRIBUTING.md) for details

### Get involved

To get involved following things can be done

- create an issue
- fix an issue and create a pull request
- see the pinned issues in the [bugtracker](https://github.com/priv-kweihmann/meta-sca/issues)

### Security Policy

For the project's security policy please see [here](SECURITY.md)
