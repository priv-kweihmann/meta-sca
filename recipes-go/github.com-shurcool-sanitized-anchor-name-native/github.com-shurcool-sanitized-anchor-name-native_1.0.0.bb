SUMMARY = "Package sanitized_anchor_name provides a func to create sanitized anchor names"
HOMEPAGE = "https://github.com/shurcooL/sanitized_anchor_name"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE;md5=c670c44b8d826e9b7b99077e5c7ba283"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "7bfe4c7ecddb3666a94b053b422cdd8f5aaa3615"
GO_IMPORT = "github.com/shurcooL/sanitized_anchor_name"

export GO111MODULE = "auto"

inherit go
inherit native
