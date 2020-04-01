SUMMARY = "File path utility"
HOMEPAGE = "https://metacpan.org/pod/Path::Tiny"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a801633f1c5bd3f1f7aa60bc72e95df9"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Path-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "bf2a021d653d7252a39c0d31b41a7c6e"
SRC_URI[sha256sum] = "813df2d140c65f795daefd8eca18e61194ecac7050c5406a069db86dea31cc3a"

S = "${WORKDIR}/Path-Tiny-${PV}"

inherit native
inherit cpan
