SUMMARY = "Query metadatdata from sdists / bdists / installed packages"
HOMEPAGE = "https://github.com/nexB/pkginfo2"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6fc86b61c6077306ca1f5edc8edcc490"

SRC_URI = "\
    git://github.com/nexB/pkginfo2.git;branch=master;protocol=https \
    file://0001-MANIFEST-add-CHANGES.txt.patch \
"
SRCREV = "df8014c2ba6216e351b80e0cb1057d275db69873"

UNPACKDIR ??= "${WORKDIR}/sources-unpack"
S = "${UNPACKDIR}/git"

inherit setuptools3
inherit_defer native
