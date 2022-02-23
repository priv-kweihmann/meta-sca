SUMMARY = "A module that allows you to declare real exception classes in Perl"
HOMEPAGE = "https://metacpan.org/pod/Exception::Class"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=49a39b705f98ccd1cd8ba5831a40cb0a"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Exception-Class-${PV}.tar.gz"

SRC_URI[md5sum] = "1e564d20b374a99fdf660ba3f36b0098"
SRC_URI[sha256sum] = "5482a77ef027ca1f9f39e1f48c558356e954936fc8fbbdee6c811c512701b249"

S = "${WORKDIR}/Exception-Class-${PV}"

inherit cpan
inherit cpan-upgrade-check
inherit native
