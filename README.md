# meta-sca <!-- omit in toc -->

![https://img.shields.io/badge/Supported%20languages-C%2CC%2B%2B%2CPython%2CShell%2Cperl-informational](https://img.shields.io/badge/Supported%20languages-C%2CC%2B%2B%2CPython%2CShell%2Cperl-informational)

[![Build Status](https://travis-ci.org/priv-kweihmann/meta-sca.svg?branch=krogoth)](https://travis-ci.org/priv-kweihmann/meta-sca)
[![Nightly classic](https://github.com/priv-kweihmann/meta-sca/workflows/[krogoth]-classic/badge.svg)](https://github.com/priv-kweihmann/meta-sca/actions)

## Notice

This is the release branch for YOCTO `krogoth`.

As this layer ran out of support by YOCTO, don't expect regular updates here as well.

Basically there will be package updates from time to time, but without a fixed release cycle.

You can also contribute package updates by pull request.

## Differences to releases starting with `thud`

For __very__ old releases of YOCTO there will be only a limited subset of tools available.

See the badge at the top of the README for details.

## Table of content <!-- omit in toc -->

- [Notice](#notice)
- [Differences to releases starting with `thud`](#differences-to-releases-starting-with-thud)
- [Purpose](#purpose)
- [Getting started](#getting-started)
- [Installation](#installation)
  - [Prerequisites](#prerequisites)
  - [Setup](#setup)
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

To install clone the needed brach(es) to any path on your local system.

### Prerequisites

- You need the `krogoth` standard [__poky__-layer](https://git.yoctoproject.org/cgit/cgit.cgi/poky/?h=krogoth) installed onto your local build environment.
- You need at least **python 3.4** needs to be installed on your build host.
- You need **glib-2.0-dev** installed on your build host (used for e.g. configcheck, lynis, tiger, upc)

### Setup

In your __bblayers.conf__-file add the following line

``` shell
BBLAYERS += "<full path to sca-layer>/meta-sca"
```

or with poky layer already setup run in shell

```shell
bitbake-layers add-layer "<full path to sca-layer>/meta-sca"
```

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

| Module          | Description                                           | Homepage                                                              | Requires                    | Requires inet | Run on image | Run on recipe | C | C++ | Python | Shell | Javascript | PHP | Go | Images | LUA | Spelling | Metrics | Binaries | Packages | Other formats | Security scope | Functional scope | Style scope |
|-----------------|-------------------------------------------------------|-----------------------------------------------------------------------|-----------------------------|---------------|--------------|---------------|---|-----|--------|-------|------------|-----|----|--------|-----|----------|---------|----------|----------|---------------|----------------|------------------|-------------|
| bandit          | Scan python code for insecurities                     | https://github.com/PyCQA/bandit                                       |                             |               | x            | x             |   |     | x      |       |            |     |    |        |     |          |         |          |          |               | x              |                  |             |
| bashate         | Shell script linter                                   | http://docs.openstack.org/developer/bashate/                          |                             |               | x            | x             |   |     |        | x     |            |     |    |        |     |          |         |          |          |               |                | x                | x           |
| bitbake         | Bitbake issue handling                                |                                                                       |                             |               | x            | x             |   |     |        |       |            |     |    |        |     |          |         |          | x        |               |                | x                | x           |
| checkbashisms   | Shell script linter                                   | https://manpages.debian.org/jessie/devscripts/checkbashisms.1.en.html |                             |               | x            | x             |   |     |        | x     |            |     |    |        |     |          |         |          |          |               |                | x                | x           |
| configcheck     | Check application configurations                      |                                                                       |                             |               | x            |               |   |     |        |       |            |     |    |        |     |          |         |          |          | x             |                | x                |             |
| cppcheck        | C/C++ linter                                          | https://github.com/danmar/cppcheck                                    |                             |               |              | x             | x | x   |        |       |            |     |    |        |     |          |         |          |          |               | x              | x                | x           |
| cpplint         | C/C++ linter                                          | https://github.com/cpplint/cpplint                                    |                             |               |              | x             | x | x   |        |       |            |     |    |        |     |          |         |          |          |               | x              | x                | x           |
| darglint        | Python docstring linter                               | https://github.com/terrencepreilly/darglint                           |                             |               |              | x             |   |     | x      |       |            |     |    |        |     |          |         |          |          |               |                |                  | x           |
| dennis          | I18N linter                                           | https://github.com/willkg/dennis/                                     |                             |               |              | x             |   |     |        |       |            |     |    |        |     |          |         |          |          | x             |                | x                | x           |
| detectsecrets   | Detect hardcoded secrets in code                      | https://github.com/Yelp/detect-secrets                                |                             |               | x            | x             |   |     |        |       |            |     |    |        |     |          |         |          | x        |               | x              | x                |             |
| flake8          | Python linter                                         | http://flake8.pycqa.org/en/latest/                                    |                             |               | x            | x             |   |     | x      |       |            |     |    |        |     |          |         |          |          |               |                | x                | x           |
| flawfinder      | C/C++ security linter                                 | https://github.com/david-a-wheeler/flawfinder                         |                             |               |              | x             | x | x   |        |       |            |     |    |        |     |          |         |          |          |               | x              |                  |             |
| flint           | C/C++ linter                                          | https://github.com/JossWhittle/FlintPlusPlus                          |                             |               |              | x             | x | x   |        |       |            |     |    |        |     |          |         |          |          |               |                | x                |             |
| gcc             | GCC compiler issues and hardening                     |                                                                       |                             |               |              | x             | x | x   |        |       |            |     |    |        |     |          |         |          |          |               | x              | x                |             |
| gixy            | NGINX config security linter                          | https://github.com/yandex/gixy                                        |                             |               | x            |               |   |     |        |       |            |     |    |        |     |          |         |          |          | x             | x              |                  |             |
| image-summary   | Aggregate all findings for package in an image        |                                                                       |                             |               | x            |               |   |     |        |       |            |     |    |        |     |          |         |          | x        |               | x              | x                | x           |
| jsonlint        | JSON file linter                                      |                                                                       |                             |               | x            | x             |   |     |        |       |            |     |    |        |     |          |         |          |          | x             |                | x                |             |
| kconfighard     | Kernel config hardening checker                       | https://github.com/a13xp0p0v/kconfig-hardened-check                   |                             |               |              | x             |   |     |        |       |            |     |    |        |     |          |         |          |          | x             | x              |                  |             |
| looong          | Find functions with too long arglists                 | https://github.com/anapaulagomes/looong                               |                             |               |              | x             |   |     | x      |       |            |     |    |        |     |          |         |          |          |               |                |                  | x           |
| lynis           | Auditing tool for images                              | https://github.com/CISOfy/lynis                                       |                             |               | x            |               |   |     |        |       |            |     |    | x      |     |          |         |          |          |               | x              |                  |             |
| msgcheck        | I18n linter                                           | https://github.com/codingjoe/msgcheck                                 |                             |               |              | x             |   |     |        |       |            |     |    |        |     |          |         |          |          | x             |                |                  | x           |
| multimetric     | Coding metrics                                        | https://github.com/priv-kweihmann/multimetric                         |                             |               | x            | x             | x | x   | x      |       | x          | x   | x  |        | x   |          | x       |          |          |               |                |                  | x           |
| mypy            | Python linter                                         | https://github.com/python/mypy                                        |                             |               | x            | x             |   |     | x      |       |            |     |    |        |     |          |         |          |          |               |                | x                |             |
| nixauditor      | Auditing tool for images                              | https://github.com/XalfiE/Nix-Auditor                                 |                             |               | x            |               |   |     |        |       |            |     |    | x      |     |          |         |          |          |               | x              |                  |             |
| oelint          | Bitbake recipe linter                                 | https://github.com/priv-kweihmann/oelint-adv                          |                             |               | x            | x             |   |     |        |       |            |     |    |        |     |          |         |          |          | x             |                |                  | x           |
| perl            | Perl warnings check                                   |                                                                       |                             |               |              | x             |   |     |        |       |            |     |    |        |     |          |         |          |          | x             |                | x                |             |
| perlcritic      | Perl linter                                           | https://metacpan.org/pod/perlcritic                                   |                             |               |              | x             |   |     |        |       |            |     |    |        |     |          |         |          |          | x             |                | x                |             |
| pscan           | Find insecure printfs                                 | http://deployingradius.com/pscan/                                     |                             |               |              | x             | x |     |        |       |            |     |    |        |     |          |         |          |          |               |                | x                |             |
| pyfindinjection | Find SQL injections in python code                    | https://github.com/uber/py-find-injection                             |                             |               | x            | x             |   |     | x      |       |            |     |    |        |     |          |         |          |          |               | x              |                  |             |
| pylint          | Python linter                                         | https://github.com/PyCQA/pylint                                       |                             |               | x            | x             |   |     | x      |       |            |     |    |        |     |          |         |          |          |               |                | x                | x           |
| pysymcheck      | Check binaries for forbidden function usage           | https://github.com/priv-kweihmann/pysymbolcheck                       |                             |               |              | x             |   |     |        |       |            |     |    |        |     |          |         | x        |          |               | x              |                  |             |
| pytype          | Python linter using type-annotations                  | https://github.com/google/pytype                                      |                             | x             |              | x             |   |     | x      |       |            |     |    |        |     |          |         |          |          |               |                | x                |             |
| rats            | Check on insecurities in several languages            | https://github.com/redNixon/rats                                      |                             |               |              | x             |   | x   | x      | x     |            | x   |    |        |     |          |         |          |          |               | x              |                  |             |
| ropgadget       | Determine ROP exploitability in binaries              | https://github.com/JonathanSalwan/ROPgadget                           |                             |               |              | x             |   |     |        |       |            |     |    |        |     |          |         | x        |          |               | x              |                  |             |
| safety          | Check for known vulnerabilities in python-packages    | https://github.com/pyupio/safety                                      |                             |               |              | x             |   |     | x      |       |            |     |    |        |     |          |         |          | x        |               | x              |                  |             |
| setuptoolslint  | Lint python-setup.py                                  | https://github.com/johnnoone/setuptools-pylint                        |                             |               |              | x             |   |     | x      |       |            |     |    |        |     |          |         |          |          |               |                | x                |             |
| sparse          | C linter                                              | https://sparse.wiki.kernel.org/index.php/Main_Page                    |                             |               |              | x             | x |     |        |       |            |     |    |        |     |          |         |          |          |               |                | x                |             |
| splint          | C linter                                              | https://github.com/splintchecker/splint                               |                             |               |              | x             | x |     |        |       |            |     |    |        |     |          |         |          |          |               | x              | x                | x           |
| systemdlint     | Systemd unit linter                                   | https://github.com/priv-kweihmann/systemdlint                         |                             |               | x            |               |   |     |        |       |            |     |    |        |     |          |         |          |          | x             | x              | x                | x           |
| tiger           | security audit and intrusion detection tool           | http://www.nongnu.org/tiger/                                          |                             |               | x            |               |   |     |        |       |            |     |    | x      |     |          |         |          |          |               | x              |                  |             |
| tlv             | Find duplicate code                                   | https://github.com/priv-kweihmann/tlv                                 | manual enable               |               | x            | x             | x | x   | x      |       | x          | x   | x  |        |     |          |         |          |          |               | x              |                  | x           |
| tscancode       | C and lua linter                                      | https://github.com/Tencent/TscanCode                                  |                             |               |              | x             | x |     |        |       |            |     |    |        |     |          |         |          |          |               |                | x                |             |
| upc             | check for simple privilege escalation vectors         | https://github.com/pentestmonkey/unix-privesc-check                   |                             |               | x            |               |   |     |        |       |            |     |    | x      |     |          |         |          |          |               | x              |                  |             |
| vulture         | Find dead python code                                 | https://github.com/jendrikseipp/vulture                               |                             |               | x            | x             |   |     | x      |       |            |     |    |        |     |          |         |          |          |               |                | x                |             |
| xmllint         | XML linter                                            | http://xmlsoft.org/xmllint.html                                       |                             |               | x            | x             |   |     |        |       |            |     |    |        |     |          |         |          |          | x             |                | x                |             |
| yamllint        | YAML linter                                           | https://github.com/adrienverge/yamllint                               |                             |               | x            | x             |   |     |        |       |            |     |    |        |     |          |         |          |          | x             |                |                  | x           |
| yara            | Find suspicious pattern in binaries                   | https://github.com/VirusTotal/yara                                    |                             |               | x            |               |   |     |        |       |            |     |    | x      |     |          |         |          |          |               | x              |                  |             |
| zrd             | I18N/G18N linter                                      | https://github.com/0Cubed/ZeroResourceDetector                        |                             |               |              | x             |   |     |        |       |            |     |    |        |     |          |         |          |          | x             |                |                  | x           |

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
  - Tools
    - [bandit](docs/conf/module/bandit.md)
    - [bashate](docs/conf/module/bashate.md)
    - [bitbake](docs/conf/module/bitbake.md)
    - [checkbashism](docs/conf/module/checkbashism.md)
    - [configcheck](docs/conf/module/configcheck.md)
    - [cppcheck](docs/conf/module/cppcheck.md)
    - [cpplint](docs/conf/module/cpplint.md)
    - [darglint](docs/conf/module/darglint.md)
    - [dennis](docs/conf/module/dennis.md)
    - [detectsecrets](docs/conf/module/detectsecrets.md)
    - [flake8](docs/conf/module/flake8.md)
    - [flawfinder](docs/conf/module/flawfinder.md)
    - [flint++](docs/conf/module/flint++.md)
    - [gcc](docs/conf/module/gcc.md)
    - [gixy](docs/conf/module/gixy.md)
    - [jsonlint](docs/conf/module/jsonlint.md)
    - [kconfighard](docs/conf/module/kconfighard.md)
    - [looong](docs/conf/module/looong.md)
    - [lynis](docs/conf/module/lynis.md)
    - [msgcheck](docs/conf/module/msgcheck.md)
    - [multimetric](docs/conf/module/multimetric.md)
    - [mypy](docs/conf/module/mypy.md)
    - [nixauditor](docs/conf/module/nixauditor.md)
    - [oelint](docs/conf/module/oelint.md)
    - [perl](docs/conf/module/perl.md)
    - [perlcritic](docs/conf/module/perlcritic.md)
    - [pscan](docs/conf/module/pscan.md)
    - [pyfindinjection](docs/conf/module/pyfindinjection.md)
    - [pylint](docs/conf/module/pylint.md)
    - [pysymcheck](docs/conf/module/pysymcheck.md)
    - [pytype](docs/conf/module/pytype.md)
    - [rats](docs/conf/module/rats.md)
    - [ropgadget](docs/conf/module/ropgadget.md)
    - [safety](docs/conf/module/safety.md)
    - [setuptoolslint](docs/conf/module/setuptoolslint.md)
    - [sparse](docs/conf/module/sparse.md)
    - [splint](docs/conf/module/splint.md)
    - [systemdlint](docs/conf/module/systemdlint.md)
    - [tiger](docs/conf/module/tiger.md)
    - [tlv](docs/conf/module/tlv.md)
    - [tscancode](docs/conf/module/tscancode.md)
    - [upc](docs/conf/module/upc.md)
    - [vulture](docs/conf/module/vulture.md)
    - [xmllint](docs/conf/module/xmllint.md)
    - [yamllint](docs/conf/module/yamllint.md)
    - [yara](docs/conf/module/yara.md)
    - [zrd](docs/conf/module/zrd.md)
  - Extra modes
    - [BestOf](docs/conf/extra/bestof.md)
    - [Image Summary](docs/conf/extra/image-summary.md)
- Configuration Examples
  - [C/C++ code while developing](docs/conf/examples/c_inflight.md)
  - [Image monitoring](docs/conf/examples/img_complete.md)
  - [Image security/hardening monitor](docs/conf/examples/img_secure.md)
  - [Python code while developing](docs/conf/examples/python_inflight.md)
  - [Shell code while developing](docs/conf/examples/shell_inflight.md)
- [Results](docs/conf/results.md)
- Build system integration
  - [Control via command-line](docs/build/control_build_by_cmdline.md)
  - Jenkins integration
    - [Basic jenkins integration](docs/build/jenkins/integration_basic.md)
    - [Parameterized jenkins build](docs/build/jenkins/integration_parameter.md)
- Application notes
  - [Recipe buildtime dependencies](docs/sca/buildtime_dependencies.md)
  - [How are the statistics of a tool calculated?](docs/sca/build_exec_times.md)
- Case studies
  - [Regression on severe code issues](docs/casestudy/simple_regression.md)
  - [Idenfying hardening and security potential](docs/casestudy/adv_security.md)

## Contributing

Feel free to create pull-requests or create an issue if you think there is something wrong or missing.

### Get involved

To get involved following things can be done

- create an issue
- fix an issue and create a pull request
- see the pinned issues in the [bugtracker](https://github.com/priv-kweihmann/meta-sca/issues)

### Security Policy

For the project's security policy please see [here](SECURITY.md)
