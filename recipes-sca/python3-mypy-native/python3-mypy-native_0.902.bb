SUMMARY = "Optional static typing for Python 3 and 2 (PEP 484)"
HOMEPAGE = "https://github.com/python/mypy"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=17b7180fcfc43c4e70c07c71588604c4"

DEPENDS += "\
            python3-mypy-extensions-native \
            python3-toml-native \
            python3-typed-ast-native \
            python3-typing-extensions-native \
            "

SRC_URI_append = " file://mypy.sca.description"
SRC_URI[md5sum] = "8db2fbcbb73ca31c0ee0c19dcbf3d76f"
SRC_URI[sha256sum] = "9236c21194fde5df1b4d8ebc2ef2c1f2a5dc7f18bcbea54274937cae2e20a01c"

PYPI_PACKAGE = "mypy"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/mypy.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
