SUMMARY = "functions and utilities for handling various things like paths, dates, files and hashes"
HOMEPAGE = "https://github.com/nexB/commoncode"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://apache-2.0.LICENSE;md5=e23fadd6ceef8c618fc1c65191d846fa"

DEPENDS += "\
            python3-attrs-native \
            python3-beautifulsoup4-native \
            python3-click-native \
            python3-intbitset-native \
            python3-requests-native \
            python3-saneyaml-native \
            python3-setuptools-scm-native \
            python3-text-unidecode-native \
            python3-toml-native \
            python3-typing-native \
           "

PYPI_PACKAGE = "commoncode"

SRC_URI = "\
           git://github.com/nexB/commoncode.git;protocol=https;branch=main \
           file://0001-remove-version-binding-for-typing.patch \
          "
SRCREV = "d89c6b65ad1c23d71b044790920504d116b322ab"

S = "${WORKDIR}/git"

inherit native
inherit setuptools3

do_install_append() {
    # forcefully replace version when using older setuptools
    find ${D} -type f -exec sed -i "s#0\.0\.0#${PV}#g" {} \;
}
