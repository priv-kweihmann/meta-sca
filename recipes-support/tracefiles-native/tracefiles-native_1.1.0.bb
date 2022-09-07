SUMMARY = "A utility to find used sources from a binary using DWARF info and more"
HOMEPAGE = "https://github.com/priv-kweihmann/tracefiles"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=42b280e18423c22b76d77cbbc6f59b47"

SRC_URI = "git://github.com/priv-kweihmann/tracefiles.git;protocol=https;branch=master"
SRCREV = "3d598b43aea4d02bb815b8fa6dab41e4022328a3"

S = "${WORKDIR}/git"

inherit setuptools3
inherit native
