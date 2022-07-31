SUMMARY = "The strictest and most opinionated python linter ever!"
HOMEPAGE = "https://github.com/wemake-services/wemake-python-styleguide"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
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

SRC_URI[md5sum] = "0d00e49908fb99be1eac0290d5a1c266"
SRC_URI[sha256sum] = "4fcd78dd55732679b5fc8bc37fd7e04bbaa5cdc1b1a829ad265e8f6b0d853cf6"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-astor \
    nativesdk-python3-attrs \
    nativesdk-python3-cognitive-complexity \
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-flake8-annotations-complexity \
    nativesdk-python3-flake8-bandit \
    nativesdk-python3-flake8-broken-line \
    nativesdk-python3-flake8-bugbear \
    nativesdk-python3-flake8-builtins \
    nativesdk-python3-flake8-coding \
    nativesdk-python3-flake8-commas \
    nativesdk-python3-flake8-comprehensions \
    nativesdk-python3-flake8-debugger \
    nativesdk-python3-flake8-docstrings \
    nativesdk-python3-flake8-eradicate \
    nativesdk-python3-flake8-executable \
    nativesdk-python3-flake8-isort \
    nativesdk-python3-flake8-logging-format \
    nativesdk-python3-flake8-pep3101 \
    nativesdk-python3-flake8-print \
    nativesdk-python3-flake8-quotes \
    nativesdk-python3-flake8-rst-docstrings \
    nativesdk-python3-flake8-string-format \
    nativesdk-python3-pep8-naming \
    nativesdk-python3-pydocstyle \
    nativesdk-python3-pygments \
    nativesdk-python3-radon \
    nativesdk-python3-stringold \
    nativesdk-python3-typing-extensions \
"
