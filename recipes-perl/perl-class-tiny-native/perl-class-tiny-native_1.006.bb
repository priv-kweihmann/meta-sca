SUMMARY = "Minimalist class construction"
HOMEPAGE = "https://metacpan.org/pod/Class::Tiny"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Class-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "fa905646a85a1478b2db1fc9113cb6ac"
SRC_URI[sha256sum] = "2efcbd31528be51d3022c616768558b78c6172df5f03c5dc698939f65488cb4e"

S = "${WORKDIR}/Class-Tiny-${PV}"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM  = "file://LICENSE;md5=73abf4c2d50faa339365e754fbb9303f"

inherit native
inherit cpan
