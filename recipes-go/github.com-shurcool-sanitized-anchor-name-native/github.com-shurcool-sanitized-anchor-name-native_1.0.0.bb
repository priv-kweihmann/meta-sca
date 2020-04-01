SUMMARY = "Package sanitized_anchor_name provides a func to create sanitized anchor names"
HOMEPAGE = "https://github.com/shurcooL/sanitized_anchor_name"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=c670c44b8d826e9b7b99077e5c7ba283"

SRC_URI = "git://${GO_IMPORT};protocol=https;tag=v${PV}"
GO_IMPORT = "github.com/shurcooL/sanitized_anchor_name"

inherit go
inherit native
