SRC_URI_append = " https://proxy.golang.org/github.com/kr/pretty/@v/v0.2.1.zip;srcoutput=github.com/kr/pretty;srcinput=github.com/kr/pretty@v0.2.1;downloadfilename=github-com-kr-pretty-0.2.1.zip;name=github-com-kr-pretty"
SRC_URI[github-com-kr-pretty.sha256sum] = "80af0452082052d1b3265d7cb8985d464d4be222c27e14658e95632c222761e5"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/kr/pretty/License;md5=449bfedd81a372635934cf9ce004c0cf \
"
