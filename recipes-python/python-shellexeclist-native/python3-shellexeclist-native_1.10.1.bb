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
SRCREV = "d503660ef1c13133f67d71bdef6ea4899a5b9c1f"

S = "${WORKDIR}/git"

inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-chardet \
    nativesdk-python3-ply \
"
