SUMMARY = "An implementation of the Vector Space model in GoLang"
HOMEPAGE = "https://github.com/boyter/golangvectorspace"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENCE;md5=2e03a9c45ba188fd78617966f0b4602f"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "94451ed344f4031d55b552944260ff629f0d95a4"
GO_IMPORT = "github.com/boyter/golangvectorspace"

UPSTREAM_CHECK_COMMITS = "1"

export GO111MODULE = "auto"

inherit go
inherit native
