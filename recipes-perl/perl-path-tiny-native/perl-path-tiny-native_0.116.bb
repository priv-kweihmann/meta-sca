SUMMARY = "File path utility"
HOMEPAGE = "https://metacpan.org/pod/Path::Tiny"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a801633f1c5bd3f1f7aa60bc72e95df9"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Path-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "0c3aee2df287cb5b67592542ae92c1b0"
SRC_URI[sha256sum] = "0379108b2aee556f877760711e03ce8775a98859cdd03cb94aaf4738a37a62d3"

S = "${WORKDIR}/Path-Tiny-${PV}"

inherit native
inherit cpan
