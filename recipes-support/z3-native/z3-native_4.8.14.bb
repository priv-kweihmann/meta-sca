DESCRIPTION = "Z3 is a theorem prover from Microsoft Research"
HOMEPAGE = "https://github.com/Z3Prover/z3"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=5f03ad1486a2e4ce71200ce0f9721557"
SRC_URI = "git://github.com/Z3Prover/z3;branch=master;protocol=https"
SRCREV = "df8f9d7dcb8b9f9b3de1072017b7c2b7f63f0af8"

S = "${WORKDIR}/git"

UPSTREAM_CHECK_GITTAGREGEX = "z3-(?P<pver>\d+\.\d+\.\d+)"

inherit cmake
inherit python3native
inherit native
