SUMMARY = "File path utility"
HOMEPAGE = "https://metacpan.org/pod/Path::Tiny"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0d4be4fba9b7d7c16379d54e87d199f1"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Path-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "2f4282d1ec2b6e4036cfb3d37a8315ad"
SRC_URI[sha256sum] = "faa2bafd722647c22d31efcafc2605ba11470b06471f815b6937d5957b1032ec"

S = "${WORKDIR}/Path-Tiny-${PV}"

inherit cpan
inherit native
