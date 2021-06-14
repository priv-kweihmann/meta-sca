SUMMARY = "List all executables called by a shell script."
HOMEPAGE = "https://github.com/priv-kweihmann/shellexeclist"

DEPENDS += "\
    python3-chardet-native \
    python3-ply-native \
"

LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "\
        file://LICENSE;md5=90965308112d84114d3d0db5134a9725 \
        file://shellexeclist/bb/LICENSE;md5=7e4cfe1c8dee5c6fe34c79c38d7b6b52 \
"

SRC_URI = "git://github.com/priv-kweihmann/shellexeclist.git;protocol=https"
SRCREV = "88a9391b55eaf96c768e7c834d080d1458cd4de3"

S = "${WORKDIR}/git"

inherit setuptools3
inherit native
