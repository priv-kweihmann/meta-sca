SUMMARY = "Parses and beautifies perl source"
HOMEPAGE = "https://metacpan.org/pod/Perl::Tidy"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SH/SHANCOCK/Perl-Tidy-${PV}.tar.gz"

SRC_URI[md5sum] = "815d4b5d5e9a942dcfd8b6b1be3a3bca"
SRC_URI[sha256sum] = "03b0e1b777c95920053d37942d6398a56b746d7c78090d522371138785c8a09e"

S = "${WORKDIR}/Perl-Tidy-${PV}"

inherit native
inherit cpan
