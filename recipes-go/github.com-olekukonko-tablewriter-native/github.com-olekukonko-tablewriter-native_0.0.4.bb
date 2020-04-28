SUMMARY = "ASCII table in golang"
HOMEPAGE = "https://github.com/olekukonko/tablewriter"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://src/${GO_IMPORT}/LICENSE.md;md5=0b3be5790ce7a5a6c959f60a5ce4c138"

DEPENDS += "github.com-mattn-go-runewidth-native"

SRC_URI = "git://${GO_IMPORT};protocol=https"
SRCREV = "876dd0e0227ec99c0243b639b92139915b65331a"
GO_IMPORT = "github.com/olekukonko/tablewriter"

inherit go
inherit native
