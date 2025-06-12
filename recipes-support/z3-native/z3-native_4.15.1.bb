DESCRIPTION = "Z3 is a theorem prover from Microsoft Research"
HOMEPAGE = "https://github.com/Z3Prover/z3"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=5f03ad1486a2e4ce71200ce0f9721557"
SRC_URI = "\
    git://github.com/Z3Prover/z3;branch=master;protocol=https \
"
SRCREV = "b665c99d0608fd392b951a04559191f97a51eb38"

UNPACKDIR ??= "${WORKDIR}/sources-unpack"
S = "${UNPACKDIR}/git"

UPSTREAM_CHECK_GITTAGREGEX = "z3-(?P<pver>\d+\.\d+\.\d+)"

inherit cmake
inherit python3native
inherit_defer native
