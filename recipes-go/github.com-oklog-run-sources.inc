SRC_URI_append = " https://proxy.golang.org/github.com/oklog/run/@v/v1.1.0.zip;srcoutput=github.com/oklog/run;srcinput=github.com/oklog/run@v1.1.0;downloadfilename=github-com-oklog-run-1.1.0.zip;name=github-com-oklog-run"
SRC_URI[github-com-oklog-run.sha256sum] = "d6f69fc71aa155043f926c2a98fc1e5b3a8ebab422f2f36d785cfba38a7ebee4"

MOD_LICENSE_append = " \
    Apache-2.0 \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/oklog/run/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
"
