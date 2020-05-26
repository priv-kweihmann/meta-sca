SUMMARY = "Fast generation of 192-bit UUIDs"
HOMEPAGE = "https://github.com/rogpeppe/fastuuid"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=f2ade4e207e03454ad3e610a00c0ef15"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "10c3923834d38e951ae8f627bfec2dc632c5b6cb"
GO_IMPORT = "github.com/rogpeppe/fastuuid"

inherit go
inherit native
