SUMMARY = "Recon system hardening scanner"
HOMEPAGE = "https://github.com/HewlettPackard/reconbf"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "python3-pbr-native"

SRC_URI = "git://github.com/HewlettPackard/reconbf.git;branch=master;protocol=https"

SRCREV = "bfd15bef549f011a3de885c3267d4f718223b798"
UPSTREAM_CHECK_COMMITS = "1"

S = "${WORKDIR}/git"

inherit setuptools3
inherit sca-description

SCA_TOOL_DESCRIPTION = "reconbf"

RDEPENDS:${PN}:class-target += "\
                                python3-compression \
                                python3-core \
                                python3-json \
                                python3-logging \
                                python3-multiprocessing \
                                python3-netserver \
                                python3-pkgutil \
                                python3-threading \
                                "

BBCLASSEXTEND = "native"
