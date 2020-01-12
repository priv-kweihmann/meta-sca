SUMMARY = "Parses and beautifies perl source"
HOMEPAGE = "https://metacpan.org/pod/Perl::Tidy"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SH/SHANCOCK/Perl-Tidy-${PV}.tar.gz"

SRC_URI[md5sum] = "480f482e8382f94aac0b246a044bc062"
SRC_URI[sha256sum] = "c8c13ab88f42409d419993d488b8dc7cf4a02d5034d3037ca859fb93b18e8086"

S = "${WORKDIR}/Perl-Tidy-${PV}"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM  = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit native
inherit cpan
