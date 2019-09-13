# meta-sca

## Before we start...

If you're interested in using this layer, please let me know where to go next.

Just [vote here](https://github.com/priv-kweihmann/meta-sca/issues/254#issue-473627394) for upcoming features.

## Purpose

This layer does offer some static code analysis tools, which can be easily configured and integrated into YOCTO/Open-Embedded build system.
The layer is designed to be easy to integrate (and fully configurable).
All results are stored to __SCA_EXPORT_DIR__ (which defaults to __${DEPLOY_DIR_IMAGE}/sca__). The results will be stored in the raw-format of the corresponding tool and in checkstyle-format.
Any result-file can be easily integrated into e.g. Jenkins or other CI-tools

### Support

This project is meant to stay - first of all this project is for you!
As long as technically possible you can expect package updates and bugfixes to this layer for all poky-releases after **thud**.

It's advised to use the tagged source versions in productive environment.

You can expect a new tagged build every 4-6 weeks.
Planning is done by milestone features on GitHub.

If there is a technical issue that might break backward compatibility it will be mentioned in release note of the corresponding milestone release.

As in every community project feedback is always welcome...

### Licensing

This layer does only provide open source tools.
The layer itself is licensed under BSD.

### Zero impact

This layer provides only **-native** tools, so actually none of the build binaries will be deployed to your target.
Everything happens on the build machine.

## Prerequisites

You need the current standard __poky__-layer installed onto your local build environment

## Installation
In your __bblayers.conf__-file add the following line 
``` shell
BBLAYERS += "<full path to sca-layer>/meta-sca"
```

## Available tools

The layer can check on a recipe-level or on an image-level.
On image-level the whole root-filesystem could be taken into account, which in most cases can't be granted on a recipe-level.
On the other hand some static code analysis does not make any sense on an image-level - so this layer does have different tools for both level available. In square brackets the corresponding setting in this layer is given

### Overview of tools

Module | C/C++ | Python | Shell | Javascript | PHP | Go | Images | Spelling | Metrics | Packages | Other Formats | Security scope | Functional scope | Style scope
| ------------- |:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|:-:|
alexkohler      |   |   |   |   |   | ✓ |   |   |   |   |   |   |   | ✓ |
ansible         |   |   |   |   |   |   | ✓ |   |   |   |   | ✓ |   |   |
ansiblelint     |   |   |   |   |   |   |   |   |   |   | ✓ | ✓ | ✓ | ✓ |
bandit          |   | ✓ |   |   |   |   |   |   |   |   | ✓ |   |   |   |
bashate         |   |   | ✓ |   |   |   |   |   |   |   |   |   | ✓ | ✓ |
bitbake         |   |   |   |   |   |   |   |   |   | ✓ |   |   | ✓ |   |
checkbashism    |   |   | ✓ |   |   |   |   |   |   |   |   |   | ✓ | ✓ |
clang           | ✓ |   |   |   |   |   |   |   |   |   |   |   | ✓ |   |
cppcheck        | ✓ |   |   |   |   |   |   |   |   |   |   | ✓ | ✓ | ✓ |
cpplint         | ✓ |   |   |   |   |   |   |   |   |   |   | ✓ | ✓ | ✓ |
cqmetrics       | ✓ |   |   |   |   |   |   |   | ✓ |   |   |   | ✓ |   |
cspell          |   |   |   |   |   |   |   | ✓ |   |   |   |   |   | ✓ |
cvecheck        |   |   |   |   |   |   |   |   |   | ✓ |   | ✓ |   |   |
darglint        |   | ✓ |   |   |   |   |   |   |   |   |   |   |   | ✓ |
dennis          |   |   |   |   |   |   |   |   |   |   | ✓ |   | ✓ | ✓ |
detectsecrets   |   |   |   |   |   |   |   |   |   | ✓ |   | ✓ |   |   |
eslint          |   |   |   | ✓ |   |   |   |   |   |   |   |   | ✓ |   |
flake8          |   | ✓ |   |   |   |   |   |   |   |   |   |   | ✓ | ✓ |
flint           | ✓ |   |   |   |   |   |   |   |   |   |   |   | ✓ |   |
gcc             | ✓ |   |   |   |   |   |   |   |   |   |   | ✓ | ✓ |   |
gixy            |   |   |   |   |   |   |   |   |   |   | ✓ | ✓ |   |   |
golint          |   |   |   |   |   | ✓ |   |   |   |   |   |   |   | ✓ |
gosec           |   |   |   |   |   | ✓ |   |   |   |   |   | ✓ |   |   |
govet           |   |   |   |   |   | ✓ |   |   |   |   |   |   | ✓ |   |
htmllint        |   |   |   |   |   |   |   |   |   |   | ✓ |   | ✓ | ✓ |
ikos            | ✓ |   |   |   |   |   |   |   |   |   |   |   | ✓ |   |
jsonlint        |   |   |   |   |   |   |   |   |   |   | ✓ |   | ✓ |   |
kconfighard     |   |   |   |   |   |   |   |   |   |   | ✓ | ✓ | ✓ |   |
npmaudit        |   |   |   |   |   |   |   |   |   | ✓ |   | ✓ |   |   |
mypy            |   | ✓ |   |   |   |   |   |   |   |   |   |   | ✓ |   |
oclint          | ✓ |   |   |   |   |   |   |   |   |   |   |   | ✓ |   |
oelint          |   |   |   |   |   |   |   |   |   |   | ✓ |   |   | ✓ |
phan            |   |   |   |   | ✓ |   |   |   |   |   |   |   | ✓ |   |
phpcodefixer    |   |   |   |   | ✓ |   |   |   |   |   |   | ✓ |   |   |
phpstan         |   |   |   |   | ✓ |   |   |   |   |   |   |   | ✓ |   |
progpilot       |   |   |   |   | ✓ |   |   |   |   |   |   | ✓ |   |   |
proselint       |   |   |   |   |   |   |   | ✓ |   |   |   |   |   | ✓ |
pyfindinjection |   | ✓ |   |   |   |   |   |   |   |   |   | ✓ |   |   |
pylint          |   | ✓ |   |   |   |   |   |   |   |   |   |   | ✓ | ✓ |
pysymcheck      |   |   |   |   |   |   |   |   |   | ✓ |   | ✓ |   |   |
pytype          |   | ✓ |   |   |   |   |   |   |   |   |   |   | ✓ |   |
radon           |   | ✓ |   |   |   |   |   |   | ✓ |   |   |   |   | ✓ |
rats            | ✓ | ✓ |   |   | ✓ |   |   |   |   |   | ✓ |   |   |   |
retire          |   |   |   | ✓ |   |   |   |   |   |   |   | ✓ |   |   |
revive          |   |   |   |   |   | ✓ |   |   |   |   |   |   | ✓ | ✓ |
ropgadget       |   |   |   |   |   |   |   |   |   | ✓ |   | ✓ |   |   |
safety          |   | ✓ |   |   |   |   |   |   |   |   |   | ✓ |   |   |
sheckcheck      |   |   | ✓ |   |   |   |   |   |   |   |   |   | ✓ | ✓ |
sparse          | ✓ |   |   |   |   |   |   |   |   |   |   |   | ✓ |   |
splint          | ✓ |   |   |   |   |   |   |   |   |   |   | ✓ | ✓ | ✓ |
standard        |   |   |   | ✓ |   |   |   |   |   |   |   |   | ✓ | ✓ |
stank           |   |   | ✓ |   |   |   |   |   |   |   |   |   | ✓ | ✓ |
stylelint       |   |   |   |   |   |   |   |   |   |   | ✓ |   |   | ✓ |
systemdlint     |   |   |   |   |   |   |   |   |   | ✓ | ✓ | ✓ | ✓ | ✓ |
textlint        |   |   |   |   |   |   |   | ✓ |   |   |   |   |   | ✓ |
tlv             | ✓ | ✓ | ✓ | ✓ |   | ✓ |   |   |   |   |   | ✓ |   | ✓ |
tscancode       | ✓ |   |   |   |   |   |   |   |   |   |   |   | ✓ |   |
vulture         |   | ✓ |   |   |   |   |   |   |   |   |   |   | ✓ |   |
xmllint         |   |   |   |   |   |   |   |   |   |   | ✓ |   | ✓ |   |
yamllint        |   |   |   |   |   |   |   |   |   |   | ✓ |   |   | ✓ |
zrd             |   |   |   |   |   |   |   |   |   |   | ✓ |   |   | ✓ |

### Tools for image recipes

 * ansible (security) [ansible]
 * [ansible-lint](https://github.com/ansible/ansible-lint) (ansible) [ansiblelint]
 * [bandit](https://github.com/PyCQA/bandit) (python/security) [bandit]
 * [bashate](http://docs.openstack.org/developer/bashate/) (shell) [bashate]
 * [checkbashisms](https://manpages.debian.org/jessie/devscripts/checkbashisms.1.en.html) (shell) [checkbashism]
 * bitbake (handle bitbake issues) [bitbake]
 * [detect-secrets](https://github.com/Yelp/detect-secrets) (detecting and preventing secrets in code) [detectsecrets]
 * [eslint](https://github.com/eslint/eslint) (javascript/html) [eslint]
 * [flake8](http://flake8.pycqa.org/en/latest/) (python) [flake8]
 * [gixy](https://github.com/yandex/gixy) (nginx-config security) [gixy]
 * [htmlhint](https://github.com/htmlhint/HTMLHint) (html) [htmlhint]
 * image-summary (aggregate all findings for package in an image) [image-summary]
 * json-parser (json) [jsonlint]
 * [mypy](https://github.com/python/mypy) (python) [mypy]
 * [oelint-adv](https://github.com/priv-kweihmann/oelint-adv) (linting bitbake recipes) [oelint]
 * [proselint](https://github.com/amperser/proselint/) (spelling) [proselint]
 * [py-find-injection](https://github.com/uber/py-find-injection) (find SQL injections in python) [pyfindinjection]
 * [pylint](https://github.com/PyCQA/pylint) (python) [pylint]
 * [shellcheck](https://github.com/koalaman/shellcheck) (shell) [shellcheck]
 * [standard](https://github.com/standard/standard) (javascript) [standard]
 * [stank](https://github.com/mcandre/stank) (shell) [stank]
 * [stylelint](https://github.com/stylelint/stylelint) (css, scss) [stylelint]
 * [systemdlint](https://github.com/priv-kweihmann/systemdlint) (systemd) [systemdlint]
 * [tlv](https://github.com/priv-kweihmann/tlv) (duplicate code) [tlv] **disabled by default**
 * [vulture](https://github.com/jendrikseipp/vulture) (python) [vulture]
 * [xmllint](http://xmlsoft.org/xmllint.html) (xml) [xmllint]
 * [yamllint](https://github.com/adrienverge/yamllint) (yaml) [yamllint]

### Tools for all other recipes

 * [alexkohler](https://github.com/alexkohler) (different tools for go) [alexkohler]
 * [ansible-lint](https://github.com/ansible/ansible-lint) (ansible) [ansiblelint]
 * [bandit](https://github.com/PyCQA/bandit) (python/security) [bandit]
 * [bashate](http://docs.openstack.org/developer/bashate/) (shell) [bashate]
 * bitbake (handle bitbake issues) [bitbake]
 * [checkbashisms](https://manpages.debian.org/jessie/devscripts/checkbashisms.1.en.html) (shell) [checkbashism]
 * [clang-tidy](https://clang.llvm.org/extra/clang-tidy/) (c/c++) [clang] **disabled by default**
 * [cppcheck](https://github.com/danmar/cppcheck) (c/c++) [cppcheck]
 * [cpplint](https://github.com/cpplint/cpplint) (c/c++) [cpplint]
 * [cqmetrics](https://github.com/dspinellis/cqmetrics) (metrics for c/c++) [cqmetrics]
 * [cspell](https://github.com/Jason3S/cspell) (spelling in c/c++/html/python/txt/md) [cspell]
 * [cve-check](https://github.com/clearlinux/cve-check-tool) (check for unpatched cve's) [cvecheck]
 * [darglint](https://github.com/terrencepreilly/darglint) (python-docstrings) [darglint]
 * [dennis](https://github.com/willkg/dennis/) (i18n) [dennis]
 * [detect-secrets](https://github.com/Yelp/detect-secrets) (detecting and preventing secrets in code) [detectsecrets]
 * [eslint](https://github.com/eslint/eslint) (javascript/html) [eslint]
 * [flake8](http://flake8.pycqa.org/en/latest/) (python) [flake8]
 * [flint++](https://github.com/JossWhittle/FlintPlusPlus) (c/c++) [flint]
 * gcc (getting compiler warnings/errors) [gcc]
 * [golint](https://github.com/golang/lint) (go) [golint]
 * [gosec](https://github.com/securego/gosec) (go) [gosec]
 * [govet](https://golang.org/cmd/vet/) (go) [govet]
 * [htmlhint](https://github.com/htmlhint/HTMLHint) (html) [htmlhint]
 * [ikos](https://github.com/nasa-sw-vnv/ikos) (c) [ikos] **disabled by default**
 * json-parser (json) [jsonlint]
 * [kconfig-hardened-check](https://github.com/a13xp0p0v/kconfig-hardened-check) (check hardening of kernel) [kconfighard]
 * [npmaudit](https://docs.npmjs.com/cli/audit) (check for security vulnerabilities in npm packages) [npmaudit]
 * [mypy](https://github.com/python/mypy) (python) [mypy]
 * [oclint](https://github.com/oclint/oclint) (c/c++/obj-c) [oclint] **disabled by default**
 * [oelint-adv](https://github.com/priv-kweihmann/oelint-adv) (linting bitbake recipes) [oelint]
 * [py-find-injection](https://github.com/uber/py-find-injection) (find SQL injections in python) [pyfindinjection]
 * [phan](https://github.com/phan/phan) (PHP) [phan] **disabled by default**
 * [phpcodefixer](https://github.com/wapmorgan/PhpCodeFixer) (PHP) [phpcodefixer] **disabled by default**
 * [phpstan](https://github.com/phpstan/phpstan) (PHP) [phpstan] **disabled by default**
 * [progpilot](https://github.com/designsecurity/progpilot) (PHP) [progpilot] **disabled by default**
 * [proselint](https://github.com/amperser/proselint/) (spelling) [proselint]
 * [pylint](https://github.com/PyCQA/pylint) (python) [pylint]
 * [pysymbolcheck](https://github.com/priv-kweihmann/pysymbolcheck) (check elf-files for used functions) [pysymcheck]
 * [pytype](https://github.com/google/pytype) (python) [pytype]
 * [radon](https://github.com/rubik/radon) (metrics for python) [radon]
 * [rats](https://github.com/redNixon/rats) (security for c/php/python/perl/ruby) [rats]
 * [retire](https://retirejs.github.io/retire.js/) (javascript, npm) [retire]
 * [revive](https://github.com/mgechev/revive) (go) [revive]
 * [ropgadget](https://github.com/JonathanSalwan/ROPgadget) (determine exploitability with ROP in binary) [ropgadget]
 * [safety](https://github.com/pyupio/safety) (python packages) [safety]
 * score (calculate a score for a module, like pylint does) [score] **disabled by default**
 * [sparse](https://sparse.wiki.kernel.org/index.php/Main_Page) (C) [sparse]
 * [splint](https://github.com/splintchecker/splint) (C) [splint]
 * [shellcheck](https://github.com/koalaman/shellcheck) (shell) [shellcheck]
 * [standard](https://github.com/standard/standard) (javascript) [standard]
 * [stank](https://github.com/mcandre/stank) (shell) [stank]
 * [stylelint](https://github.com/stylelint/stylelint) (css, scss) [stylelint]
 * [textlint](https://github.com/textlint/textlint) (spelling) [textlint]
 * [tlv](https://github.com/priv-kweihmann/tlv) (duplicate code) [tlv] **disabled by default**
 * [tscancode](https://github.com/Tencent/TscanCode) (c,c#,lua) [tscancode]
 * [vulture](https://github.com/jendrikseipp/vulture) (python) [vulture]
 * [xmllint](http://xmlsoft.org/xmllint.html) [xmllint]
 * [yamllint](https://github.com/adrienverge/yamllint) (yaml) [yamllint]
 * [zeroresourcedetector](https://github.com/0Cubed/ZeroResourceDetector) (g18n/i18n) [zrd]

each tool does have it's own benefits and flaws so don't be mad if you have 10k+ findings on the initial run.

# Optional requirements

## meta-clang

To make the integration of clang or ikos-module (clang-tidy) work you need to add the [meta-clang](https://github.com/kraj/meta-clang) layer to your bblayer-file.
Additionally you have to add

``` bitbake
PREFERRED_VERSION_clang-native = "8.%"
```

to your **local.conf**-file to make it work. Otherwise the build will fail with an error.

## meta-oe

To enable the php support you need to add the [meta-oe](http://cgit.openembedded.org/meta-openembedded) layer to your bblayer-file.
Additionally you have to add

``` bitbake
PREFERRED_VERSION_libzip-native = "1.%"
PREFERRED_VERSION_php-native = "7.%"
```

to your **local.conf**-file to make it work. Otherwise the build will fail with an error.

# Further documentation

- [Global Configuration](docs/conf/global.md)
  - [Blacklisting sources](docs/conf/blacklist.md)
  - [Configuration wizard](docs/conf/wizard.md)
  - [Custom severity](docs/conf/sevtransform.md)
  - [Enable SCA locally/globally](docs/conf/inherit.md)
  - [Fatal findings](docs/conf/suppression.md)
  - [Filter findings](docs/config/findingsfilter.md)
  - [Filter out files to check](docs/conf/filefilter.md)
  - [Suppress findings](docs/conf/suppression.md)
  - Tools
    - [alexkohler](docs/conf/module/alexkohler.md)
    - [ansible](docs/conf/module/ansible.md)
    - [ansiblelint](docs/conf/modules/ansiblelint.md)
    - [bandit](docs/conf/module/bandit.md)
    - [bashate](docs/conf/module/bashate.md)
    - [bitbake](docs/conf/module/bitbake.md)
    - [checkbashism](docs/conf/module/checkbashism.md)
    - [clang](docs/conf/module/clang.md)
    - [cppcheck](docs/conf/module/cppcheck.md)
    - [cpplint](docs/conf/module/cpplint.md)
    - [cqmetrics](docs/conf/module/cqmetrics.md)
    - [cspell](docs/conf/module/cspell.md)
    - [cvecheck](docs/conf/module/cvecheck.md)
    - [darglint](docs/conf/module/darglint.md)
    - [dennis](docs/conf/module/dennis.md)
    - [detectsecrets](docs/conf/module/detectsecrets.md)
    - [eslint](docs/conf/module/eslint.md)
    - [flake8](docs/conf/module/flake8.md)
    - [flint++](docs/conf/module/flint++.md)
    - [gcc](docs/conf/module/gcc.md)
    - [gixy](docs/conf/module/gixy.md)
    - [golint](docs/conf/module/golint.md)
    - [gosec](docs/conf/module/gosec.md)
    - [govet](docs/conf/module/govet.md)
    - [htmlhint](docs/conf/module/htmlhint.md)
    - [ikos](docs/conf/module/ikos.md)
    - [jsonlint](docs/conf/module/jsonlint.md)
    - [kconfighard](docs/conf/module/kconfighard.md)
    - [npmaudit](docs/conf/module/npmaudit.md)
    - [mypy](docs/conf/module/mypy.md)
    - [oclint](docs/conf/module/oclint.md)
    - [oelint](docs/conf/module/oelint.md)
    - [phan](docs/conf/module/phan.md)
    - [phpcodefixers](docs/conf/module/phpcodefixers.md)
    - [phpstan](docs/conf/module/phpstan.md)
    - [progpilot](docs/conf/module/progpilot.md)
    - [proselint](docs/conf/module/proselint.md)
    - [pyfindinjection](docs/conf/module/pyfindinjection.md)
    - [pylint](docs/conf/module/pylint.md)
    - [pysymcheck](docs/conf/module/pysymcheck.md)
    - [pytype](docs/conf/module/pytype.md)
    - [radon](docs/conf/module/radon.md)
    - [rats](docs/conf/module/rats.md)
    - [retire](docs/conf/module/retire.md)
    - [revive](docs/conf/module/revive.md)
    - [ropgadget](docs/conf/module/ropgadget.md)
    - [safety](docs/conf/module/safety.md)
    - [sparse](docs/conf/module/sparse.md)
    - [splint](docs/conf/module/splint.md)
    - [shellcheck](docs/conf/module/shellcheck.md)
    - [standard](docs/conf/module/standard.md)
    - [stank](docs/conf/module/stank.md)
    - [stylelint](docs/conf/module/stylelint.md)
    - [systemdlint](docs/conf/module/systemdlint.md)
    - [textlint](docs/conf/module/textlint.md)
    - [tlv](docs/conf/module/tlv.md)
    - [tscancode](docs/conf/module/tscancode.md)
    - [vulture](docs/conf/module/vulture.md)
    - [xmllint](docs/conf/module/xmllint.md)
    - [yamllint](docs/conf/module/yamllint.md)
    - [zrd](docs/conf/module/zrd.md)
  - Extra modes
    - [BestOf](docs/conf/extra/bestof.md)
    - [Image Summary](docs/conf/extra/image-summary.md)
    - [Module score](docs/conf/extra/score.md)
- Configuration Examples
  - [C/C++ code while developing](docs/conf/examples/c_inflight.md)
  - [Image monitoring](docs/conf/examples/img_complete.md)
  - [Image security/hardening monitor](docs/conf/examples/img_secure.md)
  - [Python code while developing](docs/conf/examples/python_inflight.md)
  - [Shell code while developing](docs/conf/examples/shell_inflight.md)
  - [Webapps while developing](docs/conf/examples/web_inflight.md)
- [Results](docs/conf/results.md)
- Build system integration
  - [Control via command line](docs/build/control_build_by_cmdline.md)
  - Jenkins integration
    - [Basic jenkins integratin](docs/build/jenkins/integration_basic.md)
    - [Parameterized jenkins build](docs/build/jenkins/integration_parameter.md)
- Application notes
  - [Recipe buildtime dependencies](docs/sca/buildtime_dependencies.md)
- Case studies
  - [Regression on severe code issues](docs/casestudy/simple_regression.md)
  - [Idenfying hardening and security potential](docs/casestudy/adv_security.md)

## Further development

Feel free to create pull-requests or create an issue if you think there is something wrong or missing.
