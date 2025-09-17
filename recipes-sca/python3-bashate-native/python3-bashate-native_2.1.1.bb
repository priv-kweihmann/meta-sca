SUMMARY = "A pep8 equivalent for bash scripts"
HOMEPAGE = "http://docs.openstack.org/developer/bashate/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=34400b68072d710fecd0a2940a0d1658"

DEPENDS += "\
            python3-babel-native \
            python3-native \
            python3-pbr-native \
           "

SRC_URI:append = " file://pyproject.toml"
SRC_URI[md5sum] = "b0de3d5aead12cfd6c42d9ce221c05ea"
SRC_URI[sha256sum] = "4bab6e977f8305a720535f8f93f1fb42c521fcbc4a6c2b3d3d7671f42f221f4c"

PYPI_PACKAGE = "bashate"

inherit pypi
inherit sca-description
inherit python_setuptools_build_meta
inherit_defer native

do_configure:prepend() {
    cp ${UNPACKDIR}/pyproject.toml ${S}
    rm -rf ${S}/playbooks
    rm -rf ${S}/releasenotes
}

SCA_TOOL_DESCRIPTION = "bashate"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-babel \
    nativesdk-python3-core \
    nativesdk-python3-misc \
    nativesdk-python3-pbr \
    nativesdk-python3-shell \
    nativesdk-python3-tests \
    nativesdk-python3-unittest \
"
