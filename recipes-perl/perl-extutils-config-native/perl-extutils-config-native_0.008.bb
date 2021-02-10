SUMMARY = "A wrapper for perl's configuration"
HOMEPAGE = "https://metacpan.org/pod/ExtUtils::Config"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1932ab4d8b84c25fd7967aa18088e57e"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/ExtUtils-Config-${PV}.tar.gz"

SRC_URI[md5sum] = "565a7b09c7cac5907a25bbe2c959a717"
SRC_URI[sha256sum] = "ae5104f634650dce8a79b7ed13fb59d67a39c213a6776cfdaa3ee749e62f1a8c"

S = "${WORKDIR}/ExtUtils-Config-${PV}"

inherit cpan
inherit native
