SUMMARY = "universal archive extractor using z7zip, libarchve, other libraries"
HOMEPAGE = "https://github.com/nexB/extractcode"

DEPENDS += "\
    python3-commoncode-native \
    python3-extractcode-7z-system-provided-native \
    python3-extractcode-libarchive-system-provided-native \
    python3-patch-native \
    python3-plugincode-native \
    python3-typecode-native \
"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://apache-2.0.LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI_append = " file://0001-remove-hard-lib-dependencies.patch"

PYPI_PACKAGE = "extractcode"

SRC_URI[md5sum] = "df08688646b57276b2b831a404d49fba"
SRC_URI[sha256sum] = "f91638dbf523b80df90ac184c25d5cd1ea24cac53f67a6bb7d7b389867e0744b"

inherit pypi
inherit setuptools3
inherit native

do_install_append() {
    # forcefully replace version when using older setuptools
    find ${D} -type f -exec sed -i "s#0\.0\.0#${PV}#g" {} \;
}
