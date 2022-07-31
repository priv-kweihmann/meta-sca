SUMMARY = "SCA commenting bot"
HOMEPAGE = "https://github.com/priv-kweihmann/scabot"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

DEPENDS += "\
    nativesdk-python3-github3-py \
    nativesdk-python3-python-gitlab \
    nativesdk-python3-tenacity \
    nativesdk-python3-unidiff \
"

PV = "1.0.0+${SRCREV}"

SRC_URI = "git://github.com/priv-kweihmann/scabot.git;branch=master;protocol=https"
SRCREV = "95cec6c70c1043d64c341172efb435f32ae9a482"

S = "${WORKDIR}/git"

inherit setuptools3
inherit nativesdk

UPSTREAM_CHECK_COMMITS = "1"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-github3-py \
    nativesdk-python3-python-gitlab \
    nativesdk-python3-tenacity \
    nativesdk-python3-unidiff \
"
