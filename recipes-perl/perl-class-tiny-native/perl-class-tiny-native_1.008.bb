SUMMARY = "Minimalist class construction"
HOMEPAGE = "https://metacpan.org/pod/Class::Tiny"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=73abf4c2d50faa339365e754fbb9303f"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Class-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "e3ccfae5f64d443e7e1110be964d7202"
SRC_URI[sha256sum] = "ee058a63912fa1fcb9a72498f56ca421a2056dc7f9f4b67837446d6421815615"

S = "${WORKDIR}/Class-Tiny-${PV}"

inherit cpan
inherit native
