SRC_URI += "https://proxy.golang.org/github.com/gobuffalo/github_flavored_markdown/@v/v1.1.1.zip;srcoutput=github.com/gobuffalo/github_flavored_markdown;srcinput=github.com/gobuffalo/github_flavored_markdown@v1.1.1;downloadfilename=github-com-gobuffalo-github-flavored-markdown-1.1.1.zip;name=github-com-gobuffalo-github-flavored-markdown"
SRC_URI[github-com-gobuffalo-github-flavored-markdown.sha256sum] = "1d8e9375452db7fea878fa3bbf7b7526b091f719d93d9054de568f6b2063e7f3"

GOSRC_LICENSE += "\
    BSD-2-Clause \
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/gobuffalo/github_flavored_markdown/internal/russross/blackfriday/LICENSE.txt;md5=ecf8a8a60560c35a862a4a545f2db1b3 \
    file://src/github.com/gobuffalo/github_flavored_markdown/internal/shurcooL/sanitized_anchor_name/LICENSE;md5=c670c44b8d826e9b7b99077e5c7ba283 \
"

GOSRC_INCLUDEGUARD += "github.com-gobuffalo-github-flavored-markdown-sources.inc"

require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-microcosm-cc-bluemonday-sources.inc', '', 'github.com-microcosm-cc-bluemonday-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-sergi-go-diff-sources.inc', '', 'github.com-sergi-go-diff-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-sourcegraph-annotate-sources.inc', '', 'github.com-sourcegraph-annotate-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'github.com-sourcegraph-syntaxhighlight-sources.inc', '', 'github.com-sourcegraph-syntaxhighlight-sources.inc', d)}
require ${@bb.utils.contains('GOSRC_INCLUDEGUARD', 'golang.org-x-net-sources.inc', '', 'golang.org-x-net-sources.inc', d)}
