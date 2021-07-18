SUMMARY = "Parses and beautifies perl source"
HOMEPAGE = "https://metacpan.org/pod/Perl::Tidy"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SH/SHANCOCK/Perl-Tidy-${PV}.tar.gz"

SRC_URI[sha256sum] = "4d1bd38e1c3a39a2fabb2ddf61a57e3d6cf2778a7b2aebcbf618ad205972cf14"

S = "${WORKDIR}/Perl-Tidy-${PV}"

inherit cpan
inherit cpan-upgrade-check
inherit native
