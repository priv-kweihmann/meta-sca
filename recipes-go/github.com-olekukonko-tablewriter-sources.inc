SRC_URI += "https://proxy.golang.org/github.com/olekukonko/tablewriter/@v/v0.0.5.zip;srcoutput=github.com/olekukonko/tablewriter;srcinput=github.com/olekukonko/tablewriter@v0.0.5;downloadfilename=github-com-olekukonko-tablewriter-0.0.5.zip;name=github-com-olekukonko-tablewriter"
SRC_URI[github-com-olekukonko-tablewriter.sha256sum] = "ba678c0fddd0645293afc2ac50a5943730d755e31059f588f4b4a8c581b65dad"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://github.com/olekukonko/tablewriter/LICENSE.md;md5=0b3be5790ce7a5a6c959f60a5ce4c138 \
"

GOSRC_INCLUDEGUARD += "github.com-olekukonko-tablewriter-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-mattn-go-runewidth-sources.inc', '', 'github.com-mattn-go-runewidth-sources.inc', d)}
