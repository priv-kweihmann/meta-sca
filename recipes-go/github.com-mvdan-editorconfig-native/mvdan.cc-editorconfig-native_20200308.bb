SUMMARY = "EditorConfig support in Go"
HOMEPAGE = "https://github.com/mvdan/editorconfig"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=5d1b329cf2d09f301b0d604f96046e5a"

SRC_URI = "git://github.com/mvdan/editorconfig.git;protocol=https"
SRCREV = "44790c7b343f4390136ed2831f11c67420a3362b"
UPSTREAM_CHECK_COMMITS = "1"

GO_IMPORT = "mvdan.cc/editorconfig"

inherit go
inherit native
