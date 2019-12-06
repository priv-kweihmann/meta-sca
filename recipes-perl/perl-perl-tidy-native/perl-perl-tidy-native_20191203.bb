SUMMARY = "Parses and beautifies perl source"
HOMEPAGE = "https://metacpan.org/pod/Perl::Tidy"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SH/SHANCOCK/Perl-Tidy-${PV}.tar.gz"

SRC_URI[md5sum] = "8447121717359957c493b868f7c25e7a"
SRC_URI[sha256sum] = "3afe84d410e9fc4b74a5a1481e638b0b64aebc79f149a1448849ebad69234970"

S = "${WORKDIR}/Perl-Tidy-${PV}"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM  = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

inherit native
inherit cpan
