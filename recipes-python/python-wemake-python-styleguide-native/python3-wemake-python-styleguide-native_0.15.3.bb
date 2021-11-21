SUMMARY = "The strictest and most opinionated python linter ever!"
HOMEPAGE = "https://github.com/wemake-services/wemake-python-styleguide"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=dee021f8214bb1b3fd62729a11603bf5"

DEPENDS += "\
            python3-astor-native \
            python3-attrs-native \
            python3-cognitive-complexity-native \
            python3-flake8-annotations-complexity-native \
            python3-flake8-bandit-native \
            python3-flake8-broken-line-native \
            python3-flake8-bugbear-native \
            python3-flake8-builtins-native \
            python3-flake8-coding-native \
            python3-flake8-commas-native \
            python3-flake8-comprehensions-native \
            python3-flake8-debugger-native \
            python3-flake8-docstrings-native \
            python3-flake8-eradicate-native \
            python3-flake8-executable-native \
            python3-flake8-isort-native \
            python3-flake8-logging-format-native \
            python3-flake8-native \
            python3-flake8-pep3101-native \
            python3-flake8-print-native \
            python3-flake8-quotes-native \
            python3-flake8-rst-docstrings-native \
            python3-flake8-string-format-native \
            python3-pep8-naming-native \
            python3-pydocstyle-native \
            python3-pygments-native \
            python3-radon-native \
            python3-typing-extensions-native \
            "

PYPI_PACKAGE = "wemake-python-styleguide"

SRC_URI[md5sum] = "9e6ba80db418c76d9f0b9117b80eb666"
SRC_URI[sha256sum] = "8b89aedabae67b7b915908ed06c178b702068137c0d8afe1fb59cdc829cd2143"

inherit pypi
inherit setuptools3
inherit native
