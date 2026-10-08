SUMMARY = "A module that allows you to declare real exception classes in Perl"
HOMEPAGE = "https://metacpan.org/pod/Exception::Class"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Artistic-1.0 AND GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=80aadccce75bdedfc5f333200381b541"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Exception-Class-${PV}.tar.gz"

SRC_URI[md5sum] = "17e1725e023dcfcf3b56c290dcc6b809"
SRC_URI[sha256sum] = "e2f8c0708ff8de8b1bb7be1faa3cdb240fdd9774bc741627350577ea7e0e76a1"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/Exception-Class-${PV}"

inherit cpan
inherit cpan-fixups
inherit_defer native
