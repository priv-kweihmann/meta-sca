SUMMARY = "The strictest and most opinionated python linter ever!"

HOMEPAGE = "https://github.com/wemake-services/wemake-python-styleguide"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dee021f8214bb1b3fd62729a11603bf5"

PYPI_PACKAGE = "wemake-python-styleguide"

DEPENDS += " \
            ${PYTHON_PN}-astor-native \
            ${PYTHON_PN}-attrs-native \
            ${PYTHON_PN}-flake8-annotations-complexity-native \
            ${PYTHON_PN}-flake8-bandit-native \
            ${PYTHON_PN}-flake8-broken-line-native \
            ${PYTHON_PN}-flake8-bugbear-native \
            ${PYTHON_PN}-flake8-builtins-native \
            ${PYTHON_PN}-flake8-coding-native \
            ${PYTHON_PN}-flake8-commas-native \
            ${PYTHON_PN}-flake8-comprehensions-native \
            ${PYTHON_PN}-flake8-debugger-native \
            ${PYTHON_PN}-flake8-docstrings-native \
            ${PYTHON_PN}-flake8-eradicate-native \
            ${PYTHON_PN}-flake8-executable-native \
            ${PYTHON_PN}-flake8-isort-native \
            ${PYTHON_PN}-flake8-logging-format-native \
            ${PYTHON_PN}-flake8-pep3101-native \
            ${PYTHON_PN}-flake8-print-native \
            ${PYTHON_PN}-flake8-quotes-native \
            ${PYTHON_PN}-flake8-rst-docstrings-native \
            ${PYTHON_PN}-flake8-string-format-native \
            ${PYTHON_PN}-flake8-native \
            ${PYTHON_PN}-pep8-naming-native \
            ${PYTHON_PN}-pydocstyle-native \
            ${PYTHON_PN}-pygments-native \
            ${PYTHON_PN}-typing-extensions-native \
            "

## FIXME - Server was given 504
SRC_URI = "https://files.pythonhosted.org/packages/ee/83/04575758163d0c768f6d2ec356e2820bd28640f945172f8b268962cb3e67/wemake-python-styleguide-0.11.1.tar.gz"
S = "${WORKDIR}/wemake-python-styleguide-0.11.1"
##inherit pypi
## FIXME
inherit native
