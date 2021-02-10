SUMMARY = "portably perform operations on file names"
HOMEPAGE = "https://metacpan.org/pod/File::Spec"

LICENSE = "GPL-2.0 & Artistic-1.0"
# module doesn't ship an explicit LICENSE file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/X/XS/XSAWYERX/PathTools-${PV}.tar.gz"

SRC_URI[md5sum] = "8f329058f74468a576442d841c62aa62"
SRC_URI[sha256sum] = "a558503aa6b1f8c727c0073339081a77888606aa701ada1ad62dd9d8c3f945a2"

S = "${WORKDIR}/PathTools-${PV}"

inherit cpan
inherit native
