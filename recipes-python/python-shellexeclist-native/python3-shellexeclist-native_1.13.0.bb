SUMMARY = "List all executables called by a shell script."
HOMEPAGE = "https://github.com/priv-kweihmann/shellexeclist"

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "\
    file://LICENSE;md5=90965308112d84114d3d0db5134a9725 \
    file://shellexeclist/bb/LICENSE;md5=7e4cfe1c8dee5c6fe34c79c38d7b6b52 \
"

DEPENDS += "\
    python3-chardet-native \
    python3-ply-native \
"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

SRC_URI = "git://github.com/priv-kweihmann/shellexeclist.git;branch=master;protocol=https"
SRCREV = "df4472571609e34ffb234d67534723cb6facce6f"

inherit python_setuptools_build_meta
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-chardet \
    nativesdk-python3-ply \
"
