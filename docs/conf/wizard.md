# Configuration wizard

This layer does offer a configuration wizard to guide you through the basic configuration.
To use it simply run (\<layer-root\> is the full-path to the **meta-sca**-layer-dir. e.g. /mnt/mydisk/meta-sca)

```sh
<layer-root>/script/configure <layer-root>
```

the result of the wizard should be copied into either **build/conf/local.conf** or into your ditro.conf-file

## Notes

The script requires __python3__ to be installed on your system.