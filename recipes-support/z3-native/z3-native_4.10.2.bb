DESCRIPTION = "Z3 is a theorem prover from Microsoft Research"
HOMEPAGE = "https://github.com/Z3Prover/z3"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=5f03ad1486a2e4ce71200ce0f9721557"
SRC_URI = "git://github.com/Z3Prover/z3;branch=master;protocol=https"
SRCREV = "69b1337ca634a8e8726e7815fa8730c7501c443f"

S = "${WORKDIR}/git"

UPSTREAM_CHECK_GITTAGREGEX = "z3-(?P<pver>\d+\.\d+\.\d+)"

inherit cmake
inherit python3native
inherit native
