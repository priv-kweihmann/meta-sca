SUMMARY = "Parses and beautifies perl source"
HOMEPAGE = "https://metacpan.org/pod/Perl::Tidy"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=b234ee4d69f5fce4486a80fdaf4a4263"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SH/SHANCOCK/Perl-Tidy-${PV}.tar.gz"

SRC_URI[sha256sum] = "c10c8de95c22bed6375ac224c8aab5091ab5b0351fc2cbb7ac923be90b33ee48"

S = "${WORKDIR}/Perl-Tidy-${PV}"

inherit cpan
inherit cpan-upgrade-check
inherit native
