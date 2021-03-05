SUMMARY = "prebuilt native libmagic binary and database"
HOMEPAGE = "https://github.com/nexB/typecode_libmagic_from_sources"

LICENSE = "BSD-2-Clause & PD"
LIC_FILES_CHKSUM = "\
    file://public-domain.LICENSE;md5=d41d8cd98f00b204e9800998ecf8427e \
    file://bsd-simplified.LICENSE;md5=eb57a6f5dcf47d4bb5506c8848739beb \
"

DEPENDS += "\
             python3-plugincode-native \
            "

PYPI_PACKAGE = "typecode_libmagic_from_sources"

SRC_URI[md5sum] = "2ba35431eafb5936e70fbb7cb5283649"
SRC_URI[sha256sum] = "2e801a0021ead0d1803a754beefb5a37cbf998af9602ee269c348d02dd72e3da"

UPSTREAM_CHECK_REGEX = ".*/typecode_libmagic_from_sources-(?P<pver>\d+\.\d+\.\d+)\.tar\.gz"

inherit pypi
inherit setuptools3
inherit native
