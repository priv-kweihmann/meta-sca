# meta-sca <!-- omit in toc -->

![https://img.shields.io/badge/Supported%20languages-C%2CC%2B%2B%2CGo%2CLua%2CPHP%2CPython%2CShell%2Cjs%2Cperl%2Cruby-informational](https://img.shields.io/badge/Supported%20languages-C%2CC%2B%2B%2CGo%2CLua%2CPHP%2CPython%2CShell%2Cjs%2Cperl%2Cruby-informational)

[![Build Status](https://travis-ci.org/priv-kweihmann/meta-sca.svg?branch=master)](https://travis-ci.org/priv-kweihmann/meta-sca)
[![Nightly](https://github.com/priv-kweihmann/meta-sca/workflows/[master]-nightly/badge.svg)](https://github.com/priv-kweihmann/meta-sca/actions)
[![Lastest commit](https://github.com/priv-kweihmann/meta-sca/actions/workflows/push.yml/badge.svg?branch=staging)](https://github.com/priv-kweihmann/meta-sca/actions/workflows/push.yml)

For the list of current findings from pipelines see [meta-sca report](https://priv-kweihmann.github.io/)

## Table of content <!-- omit in toc -->

- [Purpose](#purpose)
- [Getting started](#getting-started)
- [Installation](#installation)
  - [Prerequisites](#prerequisites)
  - [Use of containers](#use-of-containers)
  - [Setup](#setup)
  - [Optional layer](#optional-layer)
    - [meta-clang](#meta-clang)
    - [meta-oe](#meta-oe)
- [Web monitor](#web-monitor)
- [Support](#support)
  - [Release cycle](#release-cycle)
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

## Installation

To install clone the needed branch(es) to any path on your local system.

### Prerequisites

- You need the current standard [__poky__-layer](https://git.yoctoproject.org/cgit/cgit.cgi/poky/) installed onto your local build environment.
- You need at least **python 3.5** to be installed on your build host.
- You need **glib-2.0-dev** package installed on your build host (used for e.g. configcheck, lynis, tiger, upc)

### Use of containers

It is recommended to use `privkweihmann/yocto-sca-minimal:latest` docker container for building, which has all necessary requirements already installed.

### Setup

In your __bblayers.conf__-file add the following line

``` shell
BBLAYERS += "<full path to sca-layer>/meta-sca"
```

or with poky layer already setup run in shell

```shell
bitbake-layers add-layer "<full path to sca-layer>/meta-sca"
```

### Optional layer

#### meta-clang

To make the integration of clang (clang-tidy) work you need to add the [meta-clang](https://github.com/kraj/meta-clang) layer to your bblayer-file.

#### meta-oe

To enable the php/lua support you need to add the [meta-oe](http://cgit.openembedded.org/meta-openembedded) layer to your bblayer-file.

## Web monitor

If you're not quite convinced what this layer can do for you, have a look at the [web monitor](https://priv-kweihmann.github.io/), where all findings from the layer CI pipelines are publically available.

## Support

Actively maintained branches will receive feature and package updates according to the [release cycle](#release-cycle).
Unmaintained branches will only receive package updates on demand.

Status of the branches is described at [SECURITY.md](SECURITY.md).

It's advised to use the tagged source versions in productive environment.

### Release cycle

You can expect a new tagged build every 4-6 weeks for every actively maintained branch.
Planning is done by milestone features on GitHub.

#### Releases

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

There are some excludes to this rule (e.g. lynis) as they need to be cross-compiled to make use of them, nevertheless
none of these tools will be installed automatically to your build.

## Available tools

The layer can check on a recipe-level or on an image-level.

- On image-level the whole root-filesystem could be taken into account, which in most cases can't be granted on a recipe-level.
- On the other hand some static code analysis does not make any sense on an image-level - so this layer does have different tools for both level available.

### Overview of tools

| Module          | Description                                           | Homepage                                                              | Requires                                     | Requires inet            | Run on image | Run on recipe | C | C++ | Python | Shell | Javascript | PHP | Go | Images | LUA | Spelling | Metrics | Binaries | Packages | Other formats | Security scope | Functional scope | Style scope |
|-----------------|-------------------------------------------------------|-----------------------------------------------------------------------|----------------------------------------------|--------------------------|--------------|---------------|---|-----|--------|-------|------------|-----|----|--------|-----|----------|---------|----------|----------|---------------|----------------|------------------|-------------|
| alexkohler      | Suite of GO analysis tools                            | https://github.com/alexkohler                                         |                                              |                          |              | x             |   |     |        |       |            |     | x  |        |     |          |         |          |          |               |                |                  | x           |
| ansible         | Hardening of images with ansible                      |                                                                       |                                              |                          | x            |               |   |     |        |       |            |     |    | x      |     |          |         |          |          |               | x              |                  |             |
| ansiblelint     | Linter for ansible playbooks                          | https://github.com/ansible/ansible-lint                               |                                              |                          | x            | x             |   |     |        |       |            |     |    |        |     |          |         |          |          | x             | x              | x                | x           |
| ansibleroles    | Hardening of images with 3rd party ansible roles      | e.g. https://github.com/dev-sec                                       |                                              |                          | x            |               |   |     |        |       |            |     |    | x      |     |          |         |          |          |               | x              |                  |             |
| bandit          | Scan python code for insecurities                     | https://github.com/PyCQA/bandit                                       |                                              |                          | x            | x             |   |     | x      |       |            |     |    |        |     |          |         |          |          |               | x              |                  |             |
| bashate         | Shell script linter                                   | http://docs.openstack.org/developer/bashate/                          |                                              |                          | x            | x             |   |     |        | x     |            |     |    |        |     |          |         |          |          |               |                | x                | x           |
| bitbake         | Bitbake issue handling                                |                                                                       |                                              |                          | x            | x             |   |     |        |       |            |     |    |        |     |          |         |          | x        |               |                | x                | x           |
| cbmc            | C Bounded Model Checker                               | https://github.com/diffblue/cbmc/                                     |                                              | x                        |              | x             | x |     |        |       |            |     |    |        |     |          |         |          |          |               |                | x                |             |
| checkbashisms   | Shell script linter                                   | https://manpages.debian.org/jessie/devscripts/checkbashisms.1.en.html |                                              |                          | x            | x             |   |     |        | x     |            |     |    |        |     |          |         |          |          |               |                | x                | x           |
| clang           | C/C++ linter using LLVM                               | https://clang.llvm.org/extra/clang-tidy/                              | "meta-clang, manual enable"                  |                          |              |               | x | x   | x      |       |            |     |    |        |     |          |         |          |          |               |                |                  | x           |
| configcheck     | Check application configurations                      |                                                                       |                                              |                          | x            |               |   |     |        |       |            |     |    |        |     |          |         |          |          | x             |                | x                |             |
| cppcheck        | C/C++ linter                                          | https://github.com/danmar/cppcheck                                    |                                              |                          |              | x             | x | x   |        |       |            |     |    |        |     |          |         |          |          |               | x              | x                | x           |
| cpplint         | C/C++ linter                                          | https://github.com/cpplint/cpplint                                    |                                              |                          |              | x             | x | x   |        |       |            |     |    |        |     |          |         |          |          |               | x              | x                | x           |
| cspell          | Spelling linter                                       | https://github.com/Jason3S/cspell                                     |                                              | x                        |              | x             |   |     |        |       |            |     |    |        |     | x        |         |          |          |               |                |                  | x           |
| cvecheck        | Check for unpatched CVEs                              | https://github.com/clearlinux/cve-check-tool                          | manual enable                                | x                        |              | x             |   |     |        |       |            |     |    |        |     |          |         |          | x        |               | x              |                  |             |
| darglint        | Python docstring linter                               | https://github.com/terrencepreilly/darglint                           |                                              |                          |              | x             |   |     | x      |       |            |     |    |        |     |          |         |          |          |               |                |                  | x           |
| dennis          | I18N linter                                           | https://github.com/willkg/dennis/                                     |                                              |                          |              | x             |   |     |        |       |            |     |    |        |     |          |         |          |          | x             |                | x                | x           |
| detectsecrets   | Detect hardcoded secrets in code                      | https://github.com/Yelp/detect-secrets                                |                                              |                          | x            | x             |   |     |        |       |            |     |    |        |     |          |         |          | x        |               | x              | x                |             |
| eslint          | Javascript linter                                     | https://github.com/eslint/eslint                                      |                                              | x                        | x            | x             |   |     |        |       | x          |     |    |        |     |          |         |          |          |               |                | x                |             |
| flake8          | Python linter                                         | http://flake8.pycqa.org/en/latest/                                    |                                              |                          | x            | x             |   |     | x      |       |            |     |    |        |     |          |         |          |          |               |                | x                | x           |
| flawfinder      | C/C++ security linter                                 | https://github.com/david-a-wheeler/flawfinder                         |                                              |                          |              | x             | x | x   |        |       |            |     |    |        |     |          |         |          |          |               | x              |                  |             |
| flint           | C/C++ linter                                          | https://github.com/JossWhittle/FlintPlusPlus                          |                                              |                          |              | x             | x | x   |        |       |            |     |    |        |     |          |         |          |          |               |                | x                |             |
| gcc             | GCC compiler issues and hardening                     |                                                                       |                                              |                          |              | x             | x | x   |        |       |            |     |    |        |     |          |         |          |          |               | x              | x                |             |
| gixy            | NGINX config security linter                          | https://github.com/yandex/gixy                                        |                                              |                          | x            |               |   |     |        |       |            |     |    |        |     |          |         |          |          | x             | x              |                  |             |
| goconst         | Find variables that could be constants in GO files    | https://github.com/jgautheron/goconst                                 |                                              |                          |              | x             |   |     |        |       |            |     | x  |        |     |          |         |          |          |               |                |                  | x           |
| golint          | GO linter                                             | https://github.com/golang/lint                                        |                                              |                          |              | x             |   |     |        |       |            |     | x  |        |     |          |         |          |          |               |                |                  | x           |
| gosec           | GO security linter                                    | https://github.com/securego/gosec                                     |                                              |                          |              | x             |   |     |        |       |            |     | x  |        |     |          |         |          |          |               | x              |                  |             |
| htmlhint        | HTML linter                                           | https://github.com/htmlhint/HTMLHint                                  |                                              | x                        | x            | x             |   |     |        |       |            |     |    |        |     |          |         |          |          | x             |                | x                |             |
| image-summary   | Aggregate all findings for package in an image        |                                                                       |                                              |                          | x            |               |   |     |        |       |            |     |    |        |     |          |         |          | x        |               | x              | x                | x           |
| inspec          | framework for end-to-end infrastructure tests         | https://github.com/inspec/inspec                                      | "meta-oe, manual enable"                     |                          | x            |               |   |     |        |       |            |     |    | x      |     |          |         |          |          |               | x              |                  |             |
| jshint          | Javascript linter                                     | https://github.com/jshint/jshint                                      |                                              | x                        | x            | x             |   |     |        |       | x          |     |    |        |     |          |         |          |          |               |                | x                | x           |
| jsonlint        | JSON file linter                                      |                                                                       |                                              |                          | x            | x             |   |     |        |       |            |     |    |        |     |          |         |          |          | x             |                | x                |             |
| kconfighard     | Kernel config hardening checker                       | https://github.com/a13xp0p0v/kconfig-hardened-check                   |                                              |                          |              | x             |   |     |        |       |            |     |    |        |     |          |         |          |          | x             | x              |                  |             |
| licensecheck    | Scan code for license information                     | https://github.com/boyter/lc                                          |                                              |                          |              | x             |   |     |        |       |            |     |    |        |     |          |         |          |          | x             | x              |                  |             |
| looong          | Find functions with too long arglists                 | https://github.com/anapaulagomes/looong                               |                                              |                          |              | x             |   |     | x      |       |            |     |    |        |     |          |         |          |          |               |                |                  | x           |
| lse             | check on security issues                              | https://github.com/diego-treitos/linux-smart-enumeration              |                                              |                          | x            |               |   |     |        |       |            |     |    | x      |     |          |         |          |          |               | x              |                  |             |
| luacheck        | LUA linter                                            | https://github.com/mpeterv/luacheck                                   | "meta-oe, manual enable"                     | x                        |              | x             |   |     |        |       |            |     |    |        | x   |          |         |          |          |               |                | x                |             |
| lynis           | Auditing tool for images                              | https://github.com/CISOfy/lynis                                       |                                              |                          | x            |               |   |     |        |       |            |     |    | x      |     |          |         |          |          |               | x              |                  |             |
| msgcheck        | I18n linter                                           | https://github.com/codingjoe/msgcheck                                 |                                              |                          |              | x             |   |     |        |       |            |     |    |        |     |          |         |          |          | x             |                |                  | x           |
| multimetric     | Coding metrics                                        | https://github.com/priv-kweihmann/multimetric                         | manual enable                                |                          | x            | x             | x | x   | x      |       | x          | x   | x  |        | x   |          | x       |          |          |               |                |                  | x           |
| mypy            | Python linter                                         | https://github.com/python/mypy                                        |                                              |                          | x            | x             |   |     | x      |       |            |     |    |        |     |          |         |          |          |               |                | x                |             |
| nixauditor      | Auditing tool for images                              | https://github.com/XalfiE/Nix-Auditor                                 |                                              |                          | x            |               |   |     |        |       |            |     |    | x      |     |          |         |          |          |               | x              |                  |             |
| npmaudit        | NPM package auditor                                   | https://docs.npmjs.com/cli/audit                                      |                                              | x                        |              | x             |   |     |        |       |            |     |    |        |     |          |         |          |          | x             | x              |                  |             |
| oelint          | Bitbake recipe linter                                 | https://github.com/priv-kweihmann/oelint-adv                          |                                              |                          | x            | x             |   |     |        |       |            |     |    |        |     |          |         |          |          | x             |                |                  | x           |
| perl            | Perl warnings check                                   |                                                                       |                                              |                          |              | x             |   |     |        |       |            |     |    |        |     |          |         |          |          | x             |                | x                |             |
| perlcritic      | Perl linter                                           | https://metacpan.org/pod/perlcritic                                   |                                              |                          |              | x             |   |     |        |       |            |     |    |        |     |          |         |          |          | x             |                | x                |             |
| phan            | PHP linter                                            | https://github.com/phan/phan                                          | "meta-oe, manual enable"                     | x                        |              | x             |   |     |        |       |            | x   |    |        |     |          |         |          |          |               |                |                  | x           |
| phpcodefixer    | Find deprecated PHP functions                         | https://github.com/wapmorgan/PhpCodeFixer                             | "meta-oe, manual enable"                     | x                        |              | x             |   |     |        |       |            | x   |    |        |     |          |         |          |          |               |                | x                |             |
| phpcodesniffer  | PHP linter                                            | https://github.com/squizlabs/PHP_CodeSniffer                          | "meta-oe, manual enable"                     | x                        |              | x             |   |     |        |       |            | x   |    |        |     |          |         |          |          |               |                |                  | x           |
| phpmd           | PHP Linter                                            | https://github.com/phpmd/phpmd                                        | "meta-oe, manual enable"                     | x                        |              | x             |   |     |        |       |            | x   |    |        |     |          |         |          |          |               |                | x                | x           |
| phpsecaudit     | Find vulnerabilities in PHP code                      | https://github.com/FloeDesignTechnologies/phpcs-security-audit        | "meta-oe, manual enable"                     | x                        |              | x             |   |     |        |       |            | x   |    |        |     |          |         |          |          |               | x              |                  |             |
| phpstan         | PHP linter                                            | https://github.com/phpstan/phpstan                                    | "meta-oe, manual enable"                     | x                        |              | x             |   |     |        |       |            | x   |    |        |     |          |         |          |          |               |                |                  | x           |
| pkgqaenc        | Enhanced package QA                                   |                                                                       |                                              |                          |              | x             |   |     |        |       |            |     |    |        |     |          |         |          | x        |               | x              |                  |             |
| progpilot       | PHP linter with security focus                        | https://github.com/designsecurity/progpilot                           | "meta-oe, manual enable"                     | x                        |              | x             |   |     |        |       |            | x   |    |        |     |          |         |          |          |               |                | x                |             |
| proselint       | Spelling and text linter                              | https://github.com/amperser/proselint/                                |                                              |                          | x            | x             |   |     |        |       |            |     |    |        |     | x        |         |          |          |               |                |                  | x           |
| pscan           | Find insecure printfs                                 | http://deployingradius.com/pscan/                                     |                                              |                          |              | x             | x |     |        |       |            |     |    |        |     |          |         |          |          |               |                | x                |             |
| pyfindinjection | Find SQL injections in python code                    | https://github.com/uber/py-find-injection                             |                                              |                          | x            | x             |   |     | x      |       |            |     |    |        |     |          |         |          |          |               | x              |                  |             |
| pylint          | Python linter                                         | https://github.com/PyCQA/pylint                                       |                                              |                          | x            | x             |   |     | x      |       |            |     |    |        |     |          |         |          |          |               |                | x                | x           |
| pyright         | Python type linter                                    | https://github.com/Microsoft/pyright                                  |                                              | x                        |              | x             |   |     | x      |       |            |     |    |        |     |          |         |          |          |               |                | x                |             |
| pysymcheck      | Check binaries for forbidden function usage           | https://github.com/priv-kweihmann/pysymbolcheck                       |                                              |                          |              | x             |   |     |        |       |            |     |    |        |     |          |         | x        |          |               | x              |                  |             |
| pytype          | Python linter using type-annotations                  | https://github.com/google/pytype                                      |                                              | x                        |              | x             |   |     | x      |       |            |     |    |        |     |          |         |          |          |               |                | x                |             |
| rats            | Check on insecurities in several languages            | https://github.com/redNixon/rats                                      |                                              |                          |              | x             |   | x   | x      | x     |            | x   |    |        |     |          |         |          |          |               | x              |                  |             |
| reconbf         | security audit tool                                   | https://github.com/HewlettPackard/reconbf                             |                                              |                          | x            |               |   |     |        |       |            |     |    | x      |     |          |         |          |          |               | x              |                  |             |
| reek            | Code smell detector for Ruby                          | https://github.com/troessner/reek                                     |                                              |                          |              | x             |   |     |        |       |            |     |    |        |     |          |         |          |          | x             |                |                  | x           |
| retire          | Check for known vulnerabilities in javascript and NPM | https://retirejs.github.io/retire.js/                                 |                                              | x                        |              | x             |   |     |        |       | x          |     |    |        |     |          |         |          | x        |               | x              |                  |             |
| reuse           | Scan code for license information                     | https://github.com/fsfe/reuse-tool                                    |                                              |                          |              | x             |   |     |        |       |            |     |    |        |     |          |         |          |          | x             | x              |                  |             |
| revive          | GO linter                                             | https://github.com/mgechev/revive                                     |                                              |                          |              | x             |   |     |        |       |            |     | x  |        |     |          |         |          |          |               |                | x                | x           |
| ropgadget       | Determine ROP exploitability in binaries              | https://github.com/JonathanSalwan/ROPgadget                           | manual enable                                |                          |              | x             |   |     |        |       |            |     |    |        |     |          |         | x        |          |               | x              |                  |             |
| rubycritic      | Ruby linter                                           | https://github.com/whitesmith/rubycritic/                             |                                              |                          |              | x             |   |     |        |       |            |     |    |        |     |          |         |          |          | x             |                |                  | x           |
| safety          | Check for known vulnerabilities in python-packages    | https://github.com/pyupio/safety                                      |                                              |                          |              | x             |   |     | x      |       |            |     |    |        |     |          |         |          | x        |               | x              |                  |             |
| scancode        | Scan code for license information                     | https://github.com/nexB/scancode-toolkit                              |                                              |                          |              | x             |   |     |        |       |            |     |    |        |     |          |         |          |          | x             | x              |                  |             |
| setuptoolslint  | Lint python-setup.py                                  | https://github.com/johnnoone/setuptools-pylint                        |                                              |                          |              | x             |   |     | x      |       |            |     |    |        |     |          |         |          |          |               |                | x                |             |
| shellcheck      | Shell script linter                                   | https://github.com/koalaman/shellcheck                                |                                              |                          | x            | x             |   |     |        | x     |            |     |    |        |     |          |         |          |          |               |                | x                | x           |
| slick           | Shell script linter                                   | https://github.com/mcandre/slick                                      |                                              |                          | x            | x             |   |     |        | x     |            |     |    |        |     |          |         |          |          |               |                | x                |             |
| sparse          | C linter                                              | https://sparse.wiki.kernel.org/index.php/Main_Page                    |                                              |                          |              | x             | x |     |        |       |            |     |    |        |     |          |         |          |          |               |                | x                |             |
| standard        | Javascript linter                                     | https://github.com/standard/standard                                  |                                              | x                        | x            | x             |   |     |        |       | x          |     |    |        |     |          |         |          |          |               |                | x                | x           |
| stank           | Shell script linter                                   | https://github.com/mcandre/stank                                      |                                              |                          | x            | x             |   |     |        | x     |            |     |    |        |     |          |         |          |          |               |                | x                | x           |
| stylelint       | CSS/SCSS linter                                       | https://github.com/stylelint/stylelint                                |                                              |                          | x            | x             |   |     |        |       |            |     |    |        |     |          |         |          |          | x             |                |                  | x           |
| sudokiller      | check on sudo                                         | https://github.com/TH3xACE/SUDO_KILLER                                |                                              |                          | x            |               |   |     |        |       |            |     |    | x      |     |          |         |          |          |               | x              |                  |             |
| systemdlint     | Systemd unit linter                                   | https://github.com/priv-kweihmann/systemdlint                         |                                              |                          | x            | x             |   |     |        |       |            |     |    |        |     |          |         |          |          | x             | x              | x                | x           |
| textlint        | Spelling and text linter                              | https://github.com/textlint/textlint                                  |                                              | x                        |              | x             |   |     |        |       |            |     |    |        |     | x        |         |          |          |               |                |                  | x           |
| tiger           | security audit and intrusion detection tool           | http://www.nongnu.org/tiger/                                          |                                              |                          | x            |               |   |     |        |       |            |     |    | x      |     |          |         |          |          |               | x              |                  |             |
| tlv             | Find duplicate code                                   | https://github.com/priv-kweihmann/tlv                                 | manual enable                                |                          | x            | x             | x | x   | x      |       | x          | x   | x  |        |     |          |         |          |          |               | x              |                  | x           |
| tscancode       | C and lua linter                                      | https://github.com/Tencent/TscanCode                                  |                                              |                          |              | x             | x |     |        |       |            |     |    |        |     |          |         |          |          |               |                | x                |             |
| upc             | check for simple privilege escalation vectors         | https://github.com/pentestmonkey/unix-privesc-check                   |                                              |                          | x            |               |   |     |        |       |            |     |    | x      |     |          |         |          |          |               | x              |                  |             |
| vulture         | Find dead python code                                 | https://github.com/jendrikseipp/vulture                               |                                              |                          | x            | x             |   |     | x      |       |            |     |    |        |     |          |         |          |          |               |                | x                |             |
| wotan           | Typescript/javascript linter                          | https://github.com/fimbullinter/wotan                                 |                                              | x                        | x            | x             |   |     |        |       | x          |     |    |        |     |          |         |          |          |               |                | x                | x           |
| xmllint         | XML linter                                            | http://xmlsoft.org/xmllint.html                                       |                                              |                          | x            | x             |   |     |        |       |            |     |    |        |     |          |         |          |          | x             |                | x                |             |
| yamllint        | YAML linter                                           | https://github.com/adrienverge/yamllint                               |                                              |                          | x            | x             |   |     |        |       |            |     |    |        |     |          |         |          |          | x             |                |                  | x           |
| yara            | Find suspicious pattern in binaries                   | https://github.com/VirusTotal/yara                                    |                                              |                          | x            |               |   |     |        |       |            |     |    | x      |     |          |         |          |          |               | x              |                  |             |

each tool does have it's own benefits and flaws so don't be mad if you have 10k+ findings on the initial run.

## Further documentation

- [Global Configuration](docs/conf/global.md)
  - [Blacklisting sources](docs/conf/blacklist.md)
  - [Configuration wizard](docs/conf/wizard.md)
  - [Custom severity](docs/conf/sevtransform.md)
  - [Enable SCA locally/globally](docs/conf/inherit.md)
  - [Fatal findings](docs/conf/suppression.md)
  - [Filter findings](docs/conf/findingsfilter.md)
  - [Filter out files to check](docs/conf/filefilter.md)
  - [Output formats](docs/conf/output_formats.md)
  - [Suppress findings](docs/conf/suppression.md)
  - [Trace source files](docs/conf/tracefiles.md)
  - Tools
    - [alexkohler](docs/conf/module/alexkohler.md)
    - [ansible](docs/conf/module/ansible.md)
    - [ansiblelint](docs/conf/modules/ansiblelint.md)
    - [ansibleroles](docs/conf/modules/ansibleroles.md)
    - [bandit](docs/conf/module/bandit.md)
    - [bashate](docs/conf/module/bashate.md)
    - [bitbake](docs/conf/module/bitbake.md)
    - [cbmc](docs/conf/module/cbmc.md)
    - [checkbashism](docs/conf/module/checkbashism.md)
    - [clang](docs/conf/module/clang.md)
    - [configcheck](docs/conf/module/configcheck.md)
    - [cppcheck](docs/conf/module/cppcheck.md)
    - [cpplint](docs/conf/module/cpplint.md)
    - [cspell](docs/conf/module/cspell.md)
    - [cvecheck](docs/conf/module/cvecheck.md)
    - [darglint](docs/conf/module/darglint.md)
    - [dennis](docs/conf/module/dennis.md)
    - [detectsecrets](docs/conf/module/detectsecrets.md)
    - [eslint](docs/conf/module/eslint.md)
    - [flake8](docs/conf/module/flake8.md)
    - [flawfinder](docs/conf/module/flawfinder.md)
    - [flint++](docs/conf/module/flint++.md)
    - [gcc](docs/conf/module/gcc.md)
    - [gixy](docs/conf/module/gixy.md)
    - [goconst](docs/conf/module/goconst.md)
    - [golint](docs/conf/module/golint.md)
    - [gosec](docs/conf/module/gosec.md)
    - [htmlhint](docs/conf/module/htmlhint.md)
    - [inspec](docs/conf/module/inspec.md)
    - [jshint](docs/conf/module/jshint.md)
    - [jsonlint](docs/conf/module/jsonlint.md)
    - [kconfighard](docs/conf/module/kconfighard.md)
    - [licensecheck](docs/conf/module/licensecheck.md)
    - [looong](docs/conf/module/looong.md)
    - [lse](docs/conf/module/lse.md)
    - [luacheck](docs/conf/module/luacheck.md)
    - [lynis](docs/conf/module/lynis.md)
    - [msgcheck](docs/conf/module/msgcheck.md)
    - [multimetric](docs/conf/module/multimetric.md)
    - [mypy](docs/conf/module/mypy.md)
    - [nixauditor](docs/conf/module/nixauditor.md)
    - [npmaudit](docs/conf/module/npmaudit.md)
    - [oelint](docs/conf/module/oelint.md)
    - [perl](docs/conf/module/perl.md)
    - [perlcritic](docs/conf/module/perlcritic.md)
    - [phan](docs/conf/module/phan.md)
    - [phpcodefixer](docs/conf/module/phpcodefixer.md)
    - [phpcodesniffer](docs/conf/module/phpcodesniffer.md)
    - [phpmd](docs/conf/module/phpmd.md)
    - [phpsecaudit](docs/conf/module/phpsecaudit.md)
    - [phpstan](docs/conf/module/phpstan.md)
    - [pkgqaenc](docs/conf/module/pkgqaencpkgqaenc.md)
    - [progpilot](docs/conf/module/progpilot.md)
    - [proselint](docs/conf/module/proselint.md)
    - [pscan](docs/conf/module/pscan.md)
    - [pyfindinjection](docs/conf/module/pyfindinjection.md)
    - [pylint](docs/conf/module/pylint.md)
    - [pyright](docs/conf/module/pyright.md)
    - [pysymcheck](docs/conf/module/pysymcheck.md)
    - [pytype](docs/conf/module/pytype.md)
    - [rats](docs/conf/module/rats.md)
    - [reconbf](docs/conf/module/reconbf.md)
    - [reek](docs/conf/module/reek.md)
    - [retire](docs/conf/module/retire.md)
    - [reuse](docs/conf/module/reuse.md)
    - [revive](docs/conf/module/revive.md)
    - [ropgadget](docs/conf/module/ropgadget.md)
    - [rubycritic](docs/conf/module/rubycritic.md)
    - [safety](docs/conf/module/safety.md)
    - [scancode](docs/conf/module/scancode.md)
    - [setuptoolslint](docs/conf/module/setuptoolslint.md)
    - [shellcheck](docs/conf/module/shellcheck.md)
    - [slick](docs/conf/module/slick.md)
    - [sparse](docs/conf/module/sparse.md)
    - [standard](docs/conf/module/standard.md)
    - [stank](docs/conf/module/stank.md)
    - [stylelint](docs/conf/module/stylelint.md)
    - [sudokiller](docs/conf/module/sudokiller.md)
    - [systemdlint](docs/conf/module/systemdlint.md)
    - [textlint](docs/conf/module/textlint.md)
    - [tiger](docs/conf/module/tiger.md)
    - [tlv](docs/conf/module/tlv.md)
    - [tscancode](docs/conf/module/tscancode.md)
    - [upc](docs/conf/module/upc.md)
    - [vulture](docs/conf/module/vulture.md)
    - [wotan](docs/conf/module/wotan.md)
    - [xmllint](docs/conf/module/xmllint.md)
    - [yamllint](docs/conf/module/yamllint.md)
    - [yara](docs/conf/module/yara.md)
  - Extra modes
    - [BestOf](docs/conf/extra/bestof.md)
    - [Image Summary](docs/conf/extra/image-summary.md)
- Configuration Examples
  - [C/C++ code while developing](docs/conf/examples/c_inflight.md)
  - [Image monitoring](docs/conf/examples/img_complete.md)
  - [Image security/hardening monitor](docs/conf/examples/img_secure.md)
  - [Python code while developing](docs/conf/examples/python_inflight.md)
  - [Shell code while developing](docs/conf/examples/shell_inflight.md)
  - [Webapps while developing](docs/conf/examples/web_inflight.md)
- [Results](docs/conf/results.md)
- Build system integration
  - [Control via command-line](docs/build/control_build_by_cmdline.md)
  - Jenkins integration
    - [Basic jenkins integration](docs/build/jenkins/integration_basic.md)
    - [Parameterized jenkins build](docs/build/jenkins/integration_parameter.md)
- Application notes
  - [Recipe buildtime dependencies](docs/sca/buildtime_dependencies.md)
  - [How are the statistics of a tool calculated?](docs/sca/build_exec_times.md)
  - [How to build your own module](docs/add_your_own.md)
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
