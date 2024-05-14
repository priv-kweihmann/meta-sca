SUMMARY = "File path utility"
HOMEPAGE = "https://metacpan.org/pod/Path::Tiny"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0d4be4fba9b7d7c16379d54e87d199f1"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Path-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "656d3556bb7f30c77d0881d564e200b2"
SRC_URI[sha256sum] = "861ef09bca68254e9ab24337bb6ec9d58593a792e9d68a27ee6bec2150f06741"

S = "${WORKDIR}/Path-Tiny-${PV}"

inherit cpan
inherit_defer nativesdk
