SUMMARY = "Parses and beautifies perl source"
HOMEPAGE = "https://metacpan.org/pod/Perl::Tidy"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SH/SHANCOCK/Perl-Tidy-${PV}.tar.gz"

SRC_URI[sha256sum] = "757ac07bec59707845995aaafbb44b664120f57850ce932bc31f2d95e0c5df36"

S = "${WORKDIR}/Perl-Tidy-${PV}"

inherit native
inherit cpan
