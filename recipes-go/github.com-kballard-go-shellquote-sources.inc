SRC_URI += "https://proxy.golang.org/github.com/kballard/go-shellquote/@v/v0.0.0-20180428030007-95032a82bc51.zip;srcoutput=github.com/kballard/go-shellquote;srcinput=github.com/kballard/go-shellquote@v0.0.0-20180428030007-95032a82bc51;downloadfilename=github-com-kballard-go-shellquote-0.0.0-20180428030007-95032a82bc51.zip;name=github-com-kballard-go-shellquote"
SRC_URI[github-com-kballard-go-shellquote.sha256sum] = "ae4cb7b097dc4eb0c248dff00ed3bbf0f36984c4162ad1d615266084e58bd6cc"

GOSRC_LICENSE += "\
    MIT \
"
LIC_FILES_CHKSUM += "\
    file://src/github.com/kballard/go-shellquote/LICENSE;md5=9d95d1ad917c814c23909addb8692eeb \
"

GOSRC_INCLUDEGUARD += "github.com-kballard-go-shellquote-sources.inc"

