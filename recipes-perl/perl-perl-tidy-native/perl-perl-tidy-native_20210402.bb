SUMMARY = "Parses and beautifies perl source"
HOMEPAGE = "https://metacpan.org/pod/Perl::Tidy"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SH/SHANCOCK/Perl-Tidy-${PV}.tar.gz"

SRC_URI[sha256sum] = "b6e9c75d4c8e6047fb5c2e9c60f3ea1cc5783ffde389ef90832d1965b345e663"

S = "${WORKDIR}/Perl-Tidy-${PV}"

inherit cpan
inherit cpan-upgrade-check
inherit native
