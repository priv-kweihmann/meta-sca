SUMMARY = "A utility to find used sources from a binary using DWARF info and more"
HOMEPAGE = "https://github.com/priv-kweihmann/tracefiles"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=42b280e18423c22b76d77cbbc6f59b47"

SRC_URI = "git://github.com/priv-kweihmann/tracefiles.git;protocol=https;branch=master"
SRCREV = "e09727d5166ce961d318384348abc2dfa9ad59b5"


inherit python_setuptools_build_meta
inherit_defer native
