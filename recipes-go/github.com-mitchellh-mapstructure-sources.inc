SRC_URI_append = " https://proxy.golang.org/github.com/mitchellh/mapstructure/@v/v1.4.1.zip;srcoutput=github.com/mitchellh/mapstructure;srcinput=github.com/mitchellh/mapstructure@v1.4.1;downloadfilename=github-com-mitchellh-mapstructure-1.4.1.zip;name=github-com-mitchellh-mapstructure"
SRC_URI[github-com-mitchellh-mapstructure.sha256sum] = "bfe856861145c25f6f26c2985760e86a4634e2a28bb9b4582ff0e8a9d2621e10"

MOD_LICENSE_append = " \
    MIT \
"
LIC_FILES_CHKSUM_append = " \
    file://src/github.com/mitchellh/mapstructure/LICENSE;md5=3f7765c3d4f58e1f84c4313cecf0f5bd \
"
